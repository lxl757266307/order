package com.xue.order.service.kinds;

import com.xue.order.pojo.Kinds;
import com.xue.order.util.bean.ResultBean;

import java.util.List;

public interface KindsService {

    ResultBean insertKinds(Kinds kinds);

    ResultBean selectKindsByCode(String code);

    ResultBean deleteKindsById(String id);

    ResultBean updateKindsById(Kinds kinds);

    ResultBean updateKindsSaleAfterById(Kinds kinds);

    ResultBean updateKindsSpecialOfferById(Kinds kinds);

    ResultBean<List<Kinds>> selectFirstKindsByParentId(int isUse, String parentdId);

    ResultBean<List<Kinds>> selectFirstKindsByParentIdAndUserId(String userId, int isUse, String parentdId, int page, int pageSize);

    ResultBean<List<Kinds>> selectOtherKindsByParentId(int isUse, String parentdId, int page, int pageSize);

    ResultBean<List<Kinds>> selectOtherKindsByParentIdAndUserId(String userId, int isUse, String parentdId, int page, int pageSize);

    ResultBean<List<Kinds>> selectOtherKindsByParentIdAndUserId(String userId, String parentdId, int page, int pageSize);

    ResultBean<List<Kinds>> selectOtherKindsByLike(String content);

    ResultBean<Kinds> selectById(String id);


    ResultBean<List<Kinds>> selectShopKinds(String userId, int page, int pageSize);

    ResultBean<List<Kinds>> selectShopKindsLikeXX(String userId, String content);

    ResultBean updateNewById(Kinds kinds);
}
