package com.medplus.assetmanagementcore.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.medplus.assetmanagementcore.dao.impl.AssetDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.service.AssetService;


@Service
public class AssetServiceImpl implements AssetService{
	@Autowired
	AssetDaoImpl assetDaoImpl;
	
	/*public String addAsset(Asset asset) {
		String msg=null;
		try {
			int rows = assetDaoImpl.addAsset(asset);
			
			if(rows > 0)
				 msg="SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		
		return msg;
		
	}
	@Override
	public String updateAssetName(long assetId) {
		String msg=null;
		try {
			int rows = assetDaoImpl.updateAssetName(assetId);
			if(rows > 0)
				msg="SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		
		return msg;
	}
	@Override
	public String updateAssetCost(long assetId) {
		String msg=null;
		try {
			int rows = assetDaoImpl.updateAssetCost(assetId);
			
			if(rows > 0)
				msg= "SUCCESS";
			else
			msg= "FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		return msg;
	}
	@Override
	public String updateAssetStatus(long assetId) {
		String msg=null;
		try {
			int rows = assetDaoImpl.updateAssetStatus(assetId);
			if(rows > 0)
				msg= "SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sql exception raised");
		}
		return msg;
	}
	

}
*/
}