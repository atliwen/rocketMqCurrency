/**
 * 
 */
package com.zjs.edi.manage.mq.translation;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.zjs.edi.rocketmq.MessageListener.base.BaseForwardedMessageListConsumer;

/**
* <p>Title: myForwardedMessageListConsumer </p>
* <p>@Description: TODO </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年5月31日 下午3:56:07 
*/
public class myForwardedMessageListConsumer implements BaseForwardedMessageListConsumer
{

	@Override
	public String MessageConsumer(String strBody, MessageExt msg, ConsumeConcurrentlyContext context)
	{

		return "我了个去";
	}

}
