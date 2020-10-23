/**   
 * @Title: Order.java 
 * @Package com.xuyue.springcloud.po 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午11:03:10 
 * @version V1.0   
 */
package com.xuyue.springcloud.po;

import java.io.Serializable;

/**
 * 类功能说明：TODO
 * <p>Title:Order</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午11:03:10
 * @version  v1.0
 */
public class Order implements Serializable
{
    private String id;
    private Double price;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public Double getPrice()
    {
        return price;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }
    public String getReceiverName()
    {
        return receiverName;
    }
    public void setReceiverName(String receiverName)
    {
        this.receiverName = receiverName;
    }
    public String getReceiverAddress()
    {
        return receiverAddress;
    }
    public void setReceiverAddress(String receiverAddress)
    {
        this.receiverAddress = receiverAddress;
    }
    public String getReceiverPhone()
    {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone)
    {
        this.receiverPhone = receiverPhone;
    }
    
    @Override
    public String toString() {
        return "Order [ id="+id+",price="+price+",receiverName="+receiverName+",receiverAddress="+receiverAddress+",receiverPhone="+receiverPhone+"]";
    }
}
