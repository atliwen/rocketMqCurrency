package com.zjs.edi.rocketmq.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.zjs.edi.rocketmq.MessageListener.base.BaseMessageListenerConsumer;

/**
* <p>Title: MyMessageListenerConsumer </p>
* <p>@Description: 内销     </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年5月20日 下午4:54:40 
*/
public class ConsumableMessageListenerConsumer implements BaseMessageListenerConsumer
{

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ConsumableMessageListenerConsumer.class);

	@Override
	public ConsumeConcurrentlyStatus consumeMessage(String strBody, MessageExt msg,
			ConsumeConcurrentlyContext context)
	{
		LOGGER.info("\n 当前线程是" + Thread.currentThread().getId() + "  \n 数据是" + strBody);
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}
}
