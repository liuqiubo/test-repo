package com.tedu.sp09.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;

@Component
public class ItemFeignServiceFB implements ItemFeignService {
	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		return JsonResult.err("获得订单的商品列表失败");
	}
	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("修改商品库存失败");
	}
}
