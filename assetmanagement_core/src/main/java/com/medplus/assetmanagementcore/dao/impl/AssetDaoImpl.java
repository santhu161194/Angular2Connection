package com.medplus.assetmanagementcore.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.medplus.assetmanagementcore.dao.AssetDao;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.Queries;
@Repository
public class AssetDaoImpl implements AssetDao{
	Connection conn;
	PreparedStatement pst;
	
    @Autowired
	private JdbcTemplate template;
    @Autowired
    Asset asset;
    @Override
	public int addAsset(final Asset asset) {
		int rows=template.update(Queries.addNewAsset,new PreparedStatementSetter() {
		
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				
				pst.setLong(1,asset.getAssetId());
				pst.setString(2,asset.getSerialNumber());
				pst.setString(3,asset.getAssetName());
				pst.setString(4,asset.getAssetType().toString());
				pst.setDouble(5,asset.getCost());
				pst.setString(6,asset.getStatus().toString());
			}
		});
		return rows;
	}
	@Override
	public int updateAssetName(final long assetId) {
		int rows=template.update(Queries.updateAssetName,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
						
				/*pst.setString(1,asset.getAssetName());*/
 			
				pst.setString(1,"dell");
				pst.setLong(2,assetId);
				
			}
		});
		return rows;
	}

	@Override
	public int updateAssetCost(final long assetId) {
		int rows=template.update(Queries.updateAssetCost,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				
				pst.setDouble(1,16000.00);
				pst.setLong(2,assetId);
	
			}
		});	
		return rows;
	}

	
	@Override
	public int updateAssetStatus(final long assetId) {
		int rows=template.update(Queries.updateAssetStatus,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				asset.setStatus(AssetStatusEnum.NotAvailable);
				pst.setString(1,asset.getStatus().toString());
				pst.setLong(2,assetId);
	
			}
		});	
		return rows;
	}
}
	