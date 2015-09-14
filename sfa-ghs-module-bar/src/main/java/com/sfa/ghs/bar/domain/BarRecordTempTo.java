package com.sfa.ghs.bar.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MQ_BAR_RECORD_TEMP_TO")
public class BarRecordTempTo implements Serializable {
	private static final long serialVersionUID = 1L;

	// 标识ID
	@Id
	@Column(name = "BAR_RECORD_ID", unique = false, nullable = false)
	private String barRecordId;

	// 运单号，可以是快件运单编号，包号，笼号，袋号或车标号
	@Column(name = "WAYBILL_NO")
	private String waybillNo;

	// 地区代码，可以是总部代码，区部代码或分点部代码
	@Column(name = "ZONE_CODE")
	private String zoneCode;

	// 巴枪操作码，表示不同的巴枪操作
	@Column(name = "OP_CODE")
	private String opCode;

	// 巴枪操作辅助码，对于不同的操作码它表示不同的含义，比如：装车时表示线路编码；快件为子母件时表示母件号码；等等
	@Column(name = "OP_ATTACH_INFO")
	private String opAttachInfo;

	// 收派员工号
	@Column(name = "COURIER_CODE")
	private String courierCode;

	// 巴枪操作员工号
	@Column(name = "BAR_OPR_CODE")
	private String barOprCode;

	// 巴枪数据上传到阿修罗时间
	@Column(name = "BAR_UPLOAD_TM")
	private Date barUploadTm;

	// 对象类型，即运单号类型，车，包，笼，袋，件的类型编号，运单号码类型，3：母运单，4：子运单，1：包，5：笼、2：车 6：袋
	@Column(name = "OBJ_TYPE_CODE")
	private Long objTypeCode;

	// 容器编号，即所在的包、袋、笼、车号
	@Column(name = "CONTNR_CODE")
	private String contnrCode;

	// 是否已付款
	@Column(name = "PAY_FLG")
	private Long payFlg;

	// 派件状态、问题件代码
	@Column(name = "STAY_WHY_CODE")
	private String stayWhyCode;

	// 件数 （子母件中的子件数量）
	@Column(name = "SUBBILL_PIECE_QTY")
	private Long subbillPieceQty;

	// 是否手工录入：0 ; 正常， 1 ：手工录入，2 ：产生 缺省 0 需详细确认！（数据上传类型：0：DT900上传，
	// 1：手工录入，2：SPS上传，9：虚拟(补录产生)）
	@Column(name = "BAR_UPLOAD_TYPE_CODE")
	private Long barUploadTypeCode;

	// 计费重量
	@Column(name = "WEIGHT_QTY")
	private Double weightQty;

	// 运费
	@Column(name = "FEE_AMT")
	private Double feeAmt;

	// 月结帐号
	@Column(name = "ACCOUNTANT_CODE")
	private String accountantCode;

	// 其它信息
	@Column(name = "OTHER_INFO")
	private String otherInfo;

	// 备注 (巴枪操作说明)
	@Column(name = "OP_NAME")
	private String opName;

	// 所在地区类型
	@Column(name = "ZONE_TYPE_CODE")
	private Long zoneTypeCode;

	// 加密串
	@Column(name = "ENCRYPT_STRING")
	private String encryptString;

	// 设备号码, 巴枪设备号
	@Column(name = "BAR_SN")
	private String barSn;

	// 班次
	@Column(name = "SCHEDULE_CODE")
	private String scheduleCode;

	// 签收方式；两种：手工签收和电子签收；手工签收是直接在运单签名；电子签收是在ＨＨＴ上操作的，都由客户操作完成。
	@Column(name = "SIGN_TYPE_CODE")
	private String signTypeCode;

	// 源车标号,主要是过程操作35用
	@Column(name = "SRC_CONTNR_CODE")
	private String srcContnrCode;

	// 电话区号
	@Column(name = "PHONE_ZONE")
	private String phoneZone;

	// 电话号码
	@Column(name = "PHONE")
	private String phone;

	// 二程接拔：1、享受, 0、不享受
	@Column(name = "STOPOVER_FLG")
	private Long stopOverFlg;

	// 批次：中转批次、航空批次、报关批次、办事处班次
	@Column(name = "BATCH_CODE")
	private String batchCode;

	// 目的地代码
	@Column(name = "DEST_ZONE_CODE")
	private String destZoneCode;

	// 巴枪数据来源（DT900 0r DTX5）
	@Column(name = "AUTO_LOADING")
	private String autoloading;

	// 巴枪操作时间
	@Column(name = "BAR_SCAN_TM")
	private Date barScanTm;

	// 巴枪操作日期
	@Column(name = "BAR_SCAN_DT")
	private Date barScanDt;

	// 巴枪数据上传操作员工号
	@Column(name = "BAR_UPLOAD_OPR_CODE")
	private String barUploadOprCode;

	// 扩展附加信息1
	@Column(name = "EXTEND_ATTACH1")
	private String extendAttach1;

	// 扩展附加信息2
	@Column(name = "EXTEND_ATTACH2")
	private String extendAttach2;

	// 板号
	@Column(name = "EXTEND_ATTACH3")
	private String extendAttach3;

	// 扩展附加信息4
	@Column(name = "EXTEND_ATTACH4")
	private String extendAttach4;

	// 扩展附加信息5
	@Column(name = "EXTEND_ATTACH5")
	private String extendAttach5;

	// 扩展附加信息6
	@Column(name = "EXTEND_ATTACH6")
	private String extendAttach6;

	// 扩展附加信息7
	@Column(name = "EXTEND_ATTACH7")
	private String extendAttach7;

	// 来源，MQ|KAFKA
	@Column(name = "SOURCE")
	private String source;

	public String getBarRecordId() {
		return barRecordId;
	}

	public void setBarRecordId(String barRecordId) {
		this.barRecordId = barRecordId;
	}

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public String getOpCode() {
		return opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getOpAttachInfo() {
		return opAttachInfo;
	}

	public void setOpAttachInfo(String opAttachInfo) {
		this.opAttachInfo = opAttachInfo;
	}

	public String getCourierCode() {
		return courierCode;
	}

	public void setCourierCode(String courierCode) {
		this.courierCode = courierCode;
	}

	public String getBarOprCode() {
		return barOprCode;
	}

	public void setBarOprCode(String barOprCode) {
		this.barOprCode = barOprCode;
	}

	public Date getBarUploadTm() {
		return barUploadTm;
	}

	public void setBarUploadTm(Date barUploadTm) {
		this.barUploadTm = barUploadTm;
	}

	public Long getObjTypeCode() {
		return objTypeCode;
	}

	public void setObjTypeCode(Long objTypeCode) {
		this.objTypeCode = objTypeCode;
	}

	public String getContnrCode() {
		return contnrCode;
	}

	public void setContnrCode(String contnrCode) {
		this.contnrCode = contnrCode;
	}

	public Long getPayFlg() {
		return payFlg;
	}

	public void setPayFlg(Long payFlg) {
		this.payFlg = payFlg;
	}

	public String getStayWhyCode() {
		return stayWhyCode;
	}

	public void setStayWhyCode(String stayWhyCode) {
		this.stayWhyCode = stayWhyCode;
	}

	public Long getSubbillPieceQty() {
		return subbillPieceQty;
	}

	public void setSubbillPieceQty(Long subbillPieceQty) {
		this.subbillPieceQty = subbillPieceQty;
	}

	public Long getBarUploadTypeCode() {
		return barUploadTypeCode;
	}

	public void setBarUploadTypeCode(Long barUploadTypeCode) {
		this.barUploadTypeCode = barUploadTypeCode;
	}

	public Double getWeightQty() {
		return weightQty;
	}

	public void setWeightQty(Double weightQty) {
		this.weightQty = weightQty;
	}

	public Double getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(Double feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getAccountantCode() {
		return accountantCode;
	}

	public void setAccountantCode(String accountantCode) {
		this.accountantCode = accountantCode;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public Long getZoneTypeCode() {
		return zoneTypeCode;
	}

	public void setZoneTypeCode(Long zoneTypeCode) {
		this.zoneTypeCode = zoneTypeCode;
	}

	public String getEncryptString() {
		return encryptString;
	}

	public void setEncryptString(String encryptString) {
		this.encryptString = encryptString;
	}

	public String getBarSn() {
		return barSn;
	}

	public void setBarSn(String barSn) {
		this.barSn = barSn;
	}

	public String getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	public String getSignTypeCode() {
		return signTypeCode;
	}

	public void setSignTypeCode(String signTypeCode) {
		this.signTypeCode = signTypeCode;
	}

	public String getSrcContnrCode() {
		return srcContnrCode;
	}

	public void setSrcContnrCode(String srcContnrCode) {
		this.srcContnrCode = srcContnrCode;
	}

	public String getPhoneZone() {
		return phoneZone;
	}

	public void setPhoneZone(String phoneZone) {
		this.phoneZone = phoneZone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getStopOverFlg() {
		return stopOverFlg;
	}

	public void setStopOverFlg(Long stopOverFlg) {
		this.stopOverFlg = stopOverFlg;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getDestZoneCode() {
		return destZoneCode;
	}

	public void setDestZoneCode(String destZoneCode) {
		this.destZoneCode = destZoneCode;
	}

	public String getAutoloading() {
		return autoloading;
	}

	public void setAutoloading(String autoloading) {
		this.autoloading = autoloading;
	}

	public Date getBarScanTm() {
		return barScanTm;
	}

	public void setBarScanTm(Date barScanTm) {
		this.barScanTm = barScanTm;
	}

	public Date getBarScanDt() {
		return barScanDt;
	}

	public void setBarScanDt(Date barScanDt) {
		this.barScanDt = barScanDt;
	}

	public String getBarUploadOprCode() {
		return barUploadOprCode;
	}

	public void setBarUploadOprCode(String barUploadOprCode) {
		this.barUploadOprCode = barUploadOprCode;
	}

	public String getExtendAttach1() {
		return extendAttach1;
	}

	public void setExtendAttach1(String extendAttach1) {
		this.extendAttach1 = extendAttach1;
	}

	public String getExtendAttach2() {
		return extendAttach2;
	}

	public void setExtendAttach2(String extendAttach2) {
		this.extendAttach2 = extendAttach2;
	}

	public String getExtendAttach3() {
		return extendAttach3;
	}

	public void setExtendAttach3(String extendAttach3) {
		this.extendAttach3 = extendAttach3;
	}

	public String getExtendAttach4() {
		return extendAttach4;
	}

	public void setExtendAttach4(String extendAttach4) {
		this.extendAttach4 = extendAttach4;
	}

	public String getExtendAttach5() {
		return extendAttach5;
	}

	public void setExtendAttach5(String extendAttach5) {
		this.extendAttach5 = extendAttach5;
	}

	public String getExtendAttach6() {
		return extendAttach6;
	}

	public void setExtendAttach6(String extendAttach6) {
		this.extendAttach6 = extendAttach6;
	}

	public String getExtendAttach7() {
		return extendAttach7;
	}

	public void setExtendAttach7(String extendAttach7) {
		this.extendAttach7 = extendAttach7;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "BarRecordTempTo [barRecordId=" + barRecordId + ", waybillNo=" + waybillNo + ", zoneCode=" + zoneCode
				+ ", opCode=" + opCode + ", opAttachInfo=" + opAttachInfo + ", courierCode=" + courierCode
				+ ", barOprCode=" + barOprCode + ", barUploadTm=" + barUploadTm + ", objTypeCode=" + objTypeCode
				+ ", contnrCode=" + contnrCode + ", payFlg=" + payFlg + ", stayWhyCode=" + stayWhyCode
				+ ", subbillPieceQty=" + subbillPieceQty + ", barUploadTypeCode=" + barUploadTypeCode + ", weightQty="
				+ weightQty + ", feeAmt=" + feeAmt + ", accountantCode=" + accountantCode + ", otherInfo=" + otherInfo
				+ ", opName=" + opName + ", zoneTypeCode=" + zoneTypeCode + ", encryptString=" + encryptString
				+ ", barSn=" + barSn + ", scheduleCode=" + scheduleCode + ", signTypeCode=" + signTypeCode
				+ ", srcContnrCode=" + srcContnrCode + ", phoneZone=" + phoneZone + ", phone=" + phone
				+ ", stopOverFlg=" + stopOverFlg + ", batchCode=" + batchCode + ", destZoneCode=" + destZoneCode
				+ ", autoloading=" + autoloading + ", barScanTm=" + barScanTm + ", barScanDt=" + barScanDt
				+ ", barUploadOprCode=" + barUploadOprCode + ", extendAttach1=" + extendAttach1 + ", extendAttach2="
				+ extendAttach2 + ", extendAttach3=" + extendAttach3 + ", extendAttach4=" + extendAttach4
				+ ", extendAttach5=" + extendAttach5 + ", extendAttach6=" + extendAttach6 + ", extendAttach7="
				+ extendAttach7 + ", source=" + source + "]";
	}
}
