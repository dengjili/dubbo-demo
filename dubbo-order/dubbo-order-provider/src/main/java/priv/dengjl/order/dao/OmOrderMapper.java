package priv.dengjl.order.dao;

import org.springframework.stereotype.Repository;

import priv.dengjl.order.bean.OmOrder;

@Repository
public interface OmOrderMapper {
	void addOmOrder(OmOrder omOrder);
}