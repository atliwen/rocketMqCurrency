/**
 * 
 */
package com.zjs.edi.rocketmq.MessageListener.base;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
* <p>Title: ForwardedMessageListConsumer </p>
* <p>@Description: TODO </p>
* <p>Company:  </p>
* @author 李文
* @date   2016年5月31日 下午2:01:32 
*/
public interface BaseForwardedMessageListConsumer
{

	/**
	 *  转译  转发 消息处理
	 * @param strBody
	 * @param msg
	 * @param context
	 * @return
	 */
	public String MessageConsumer(String strBody, MessageExt msg, ConsumeConcurrentlyContext context);

}
