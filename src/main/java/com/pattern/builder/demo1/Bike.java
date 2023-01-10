package com.pattern.builder.demo1;

/***
 * <p>Description: 产品对象</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 14:30
 * @version 1.0.0
 *
 */
public class Bike {

    private String frame; // 车架

    private String seat; // 车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
