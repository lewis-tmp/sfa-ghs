package com.sfa.ghs.kafka.listener;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sf.fvp.ConvertUtil;
import com.sf.fvp.dto.BarRecordBaseDto;
import com.sf.kafka.api.consume.IByteArrayMessageConsumeListener;
import com.sf.kafka.api.consume.KafkaConsumeRetryException;
import com.sf.kafka.check.util.JsonUtil;
import com.sfa.ghs.bar.domain.BarRecordTempTo;
import com.sfa.ghs.bar.service.IBarRecordTempToService;

@Component
public class ByteMessageListener implements IByteArrayMessageConsumeListener {
	private static final Logger log = Logger.getLogger(ByteMessageListener.class);

	@Autowired
	private IBarRecordTempToService barService;

	@Override
	public void onMessage(List<byte[]> messages) throws KafkaConsumeRetryException {
		for (byte[] bs : messages) {
			BarRecordBaseDto dto = ConvertUtil.fromByte(BarRecordBaseDto.class, bs);

			if (this.validDto(dto)) {
				String json = JsonUtil.writeValueAsString(dto);

				BarRecordTempTo temp = JsonUtil.readData(json, BarRecordTempTo.class);
				temp.setSource("KAFKA");
				log.info(temp.toString());

				this.barService.insert(temp);
			}

		}
	}

	private boolean validDto(BarRecordBaseDto dto) {
		if (null == dto || null == dto.getWaybillNo() || null == dto.getOpCode()) {
			return false;
		}

		List<String> list = new ArrayList<String>();
		list.add("665");
		list.add("666");
		list.add("667");

		return list.contains(dto.getOpCode());
	}

}
