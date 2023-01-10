package com.pattern.builder.demo2;

/***
 * <p>Description: 手机类</p>
 *
 *
 * @return
 * @author chenhan
 * @date 2023/1/10 15:55
 * @version 1.0.0
 *
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;



    // 私有构造方法
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;

    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        // 使用构建者创建phone对象
        public Phone build() {
            return new Phone(this);
        }


    }


}
