package com.ps.metals.helper;

import org.springframework.stereotype.Component;

import com.ps.metals.bean.type.TradeRefData;
import com.ps.metals.valueobject.RefDataVO;
import com.ps.metals.valueobject.TradeVO;

@Component
public class TradeServiceHelper {

	public TradeVO prepareTrade(TradeVO tradeVO, RefDataVO refDataVO, TradeRefData type) {
		switch (type) {
			case LOCATION:
				tradeVO.setLocation(refDataVO.getName());
				break;
			case COMMODITY:
				tradeVO.setCommodityName(refDataVO.getName());
				break;
			case COUNTER_PARTY:
				tradeVO.setCounterparty(refDataVO.getName());
				break;
			default:
				return tradeVO;
		}
		return tradeVO;
	}
}
