package com.example.shopping.dto;

import java.io.Serializable;

import com.example.shopping.entity.CartEntity;

import lombok.Data;

/**
 * カート情報格納用Dto
 * @author koki_shinzato
 */
@Data
public class CartDto implements Serializable{
	
	// 商品ID
	private Integer commodityId;
	
	// 商品数
	private Integer quantity;
	
	// 結合先テーブル
	private MenuDto menu;
	
	public CartDto(){
		menu = new MenuDto();
	}
	
	/**
	 * Dto → Entity 変換
	 * @return カート情報（Entity）
	 */
	public CartEntity toEntity() {
		
		CartEntity cartEntity = new CartEntity();
		cartEntity.setCommodityId(commodityId);
		cartEntity.setQuantity(quantity);
		
		return cartEntity;
	}
}
