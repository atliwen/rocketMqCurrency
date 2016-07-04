package com.zjs.edi.rocketmq.MessageListener.base;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
* <p>Title: baseMessageListenerConsumer </p>
* <p>@Description:  自定义消费 接口      继承该接口   实现消费方法      </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年5月20日 下午5:37:07 
*/
public interface BaseMessageListenerConsumer
{

	/**
	 *   自定义消费方法  
	 * 
	 * @param msg
	 * @param context
	 * @return
	 */
	public ConsumeConcurrentlyStatus consumeMessage(String strBody, MessageExt msg,
			ConsumeConcurrentlyContext context);
}
