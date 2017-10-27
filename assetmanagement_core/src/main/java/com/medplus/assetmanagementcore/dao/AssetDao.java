package com.medplus.assetmanagementcore.dao;

/*import java.util.List;
import java.util.Map;*/

import com.medplus.assetmanagementcore.model.Asset;

public interface AssetDao {

	public int addAsset(Asset asset);
	
	public  int updateAssetName(long assetId);
	
	public  int updateAssetCost(long assetId);
	
	public  int updateAssetStatus(long assetId);
	
	/*public List<Asset> getAllAssets();
	
	public Asset getAsset(long assetId); 
	
	public List<Asset> getAssetByAvailability(String status);
    
	public Map<Integer,Object> getAssetRequests();
	
	public Map<Integer,Object> getAssetRequestsByEmployee(String empId);
	
	
	public boolean allocateAsset(String empId,long assetId,String edpId);
	
	public boolean deAllocateAsset(long assetId,String edpId);*/
}
