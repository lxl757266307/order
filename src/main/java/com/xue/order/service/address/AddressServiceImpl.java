package com.xue.order.service.address;

import com.xue.order.dao.AddressMapper;
import com.xue.order.pojo.Address;
import com.xue.order.pojo.AddressExample;
import com.xue.order.util.bean.ConstCode;
import com.xue.order.util.bean.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public ResultBean insertAddress(Address address) {
        address.setId("" + UUID.randomUUID() + System.currentTimeMillis());
        int code = addressMapper.insertSelective(address);
        ResultBean resultBean = new ResultBean();
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("插入成功！");
            return resultBean;
        }

        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("插入失败！");
        return resultBean;
    }

    @Override
    public ResultBean updateAddress(Address address) {
        AddressExample addressExample = new AddressExample();
        int code = addressMapper.updateByExampleSelective(address, addressExample);
        ResultBean resultBean = new ResultBean();
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("更新成功！");
            return resultBean;
        }

        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("更新失败！");
        return resultBean;
    }

    @Override
    public ResultBean<List<Address>> selectAllAddressByUserId(String userId) {
        ResultBean<List<Address>> resultBean = new ResultBean<>();
        List<Address> listResultBean = addressMapper.selectAllAddressByUserId(userId);
        if (listResultBean != null) {
            if (listResultBean.size() > 0) {
                resultBean.setCode(ConstCode.NOMAL_CODE);
                resultBean.setData(listResultBean);
                return resultBean;
            } else {
                resultBean.setCode(ConstCode.NO_DATA);
                resultBean.setMsg("暂无数据！");
                return resultBean;
            }
        }
        resultBean.setCode(ConstCode.NO_DATA);
        resultBean.setMsg("暂无数据！");
        return resultBean;
    }

    @Override
    public ResultBean setDefaultAddress(String id) {
        ResultBean<List<Address>> resultBean = new ResultBean<>();
        List<Address> listResultBean = addressMapper.selectAllAddressByUserId(id);
        for (int i = 0; i < listResultBean.size(); i++) {
            if (!id.equals(listResultBean.get(i).getId())) {
                addressMapper.setDefaultAddress(ConstCode.NOMAL_ADDRESS, id);
            }
        }
        int code = addressMapper.setDefaultAddress(ConstCode.DEFAULT_ADDRESS, id);
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("设置成功！");
            return resultBean;
        }

        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("设置失败！");
        return resultBean;
    }

    @Override
    public ResultBean deleteAddressById(String id) {
        int code = addressMapper.deleteAddressById(id);
        ResultBean resultBean = new ResultBean();
        if (code > 0) {
            resultBean.setCode(ConstCode.NOMAL_CODE);
            resultBean.setMsg("删除成功！");
            return resultBean;
        }

        resultBean.setCode(ConstCode.ERROR);
        resultBean.setMsg("删除失败！");
        return resultBean;
    }
}
