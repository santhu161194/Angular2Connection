package com.medplus.assetmanagementcore.model;

import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;


public class Asset {
	private long assetId;

	private String serialNumber;

	private String assetName;

	private AssetTypeEnum assetType;
	
	private double cost;

	private AssetStatusEnum status;
/*private String assetType;
private String assertStatus;
*/
	public long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	/*public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssertStatus() {
		return assertStatus;
	}

	public void setAssertStatus(String assertStatus) {
		this.assertStatus = assertStatus;
	}*/

	public AssetStatusEnum getStatus() {
		return status;
	}

	public void setStatus(AssetStatusEnum status) {
		this.status = status;
	}

	public AssetTypeEnum getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetTypeEnum assetType) {
		this.assetType = assetType;
	}

}
