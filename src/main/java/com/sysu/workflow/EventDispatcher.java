
package com.sysu.workflow;

import java.util.Map;

/**
 *
 * 给另外一个SCXML Intepreter发送消息的接口
 * 其他外部系统私用一个Event I/O processor 或者raise事件在当前SCXML session里面
 *
 *
 * The event controller interface used to send messages containing
 * events or other information directly to another SCXML Interpreter,
 * other external systems using an Event I/O Processor or to raise
 * events in the current SCXML session.
 */
public interface EventDispatcher {

    /**
     * 取消指定的消息
     *
     * @param sendId 要取消的消息的ID
     */
    void cancel(String sendId);

    /**
     * 发送消息到目标
     *
     * @param ioProcessors the available SCXMLIOProcessors, the same map as the SCXML system variable _ioprocessors
     * @param id           The ID of the send message
     * @param target       An expression returning the target location of the event
     * @param type         The type of the Event I/O Processor that the event should
     *                     be dispatched to
     * @param event        The type of event being generated.
     * @param data         The event payload
     * @param hints        The data containing information which may be
     *                     used by the implementing platform to configure the event processor
     * @param delay        The event is dispatched after the delay interval elapses
     */
    void send(Map<String, SCXMLIOProcessor> ioProcessors, String id, String target, String type, String event,
              Object data, Object hints, long delay);

}

