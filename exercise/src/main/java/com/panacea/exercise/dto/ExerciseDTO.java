package com.panacea.exercise.dto;

public class ExerciseDTO {

	private long voucherControlNo;
	private long carnivalPlanId;
	private String deviceOS;
	private long voucherId;

	public long getVoucherControlNo() {
		return voucherControlNo;
	}

	public void setVoucherControlNo(long voucherControlNo) {
		this.voucherControlNo = voucherControlNo;
	}

	public long getCarnivalPlanId() {
		return carnivalPlanId;
	}

	public void setCarnivalPlanId(long carnivalPlanId) {
		this.carnivalPlanId = carnivalPlanId;
	}

	public String getDeviceOS() {
		return deviceOS;
	}

	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
	}

	/**
	 * @return the voucherId
	 */
	public long getVoucherId() {
		return voucherId;
	}

	/**
	 * @param voucherId the voucherId to set
	 */
	public void setVoucherId(long voucherId) {
		this.voucherId = voucherId;
	}

	@Override
	public String toString() {
		return "CPVoucherUserDTO [voucherControlNo=" + voucherControlNo + ", carnivalPlanId=" + carnivalPlanId + ", deviceOS=" + deviceOS + "]";
	}
}