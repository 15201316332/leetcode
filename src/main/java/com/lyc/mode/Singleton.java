package com.lyc.mode;

/**
 * @author Administrator
 * @date 2019/4/12
 * @description 双重锁定单例模式
 */
public class Singleton {

	/**
	 * ***** 静态内存可见实例 ******
	 */
	private volatile static Singleton singleton;

	/**
	 * ***** 私有化构造方法 ******
	 */
	private Singleton() {
	}

	/**
	 * ***** 只有构建时加锁，加锁后也先检查后创建 ******
	 */
	public static Singleton getInstance() {
		if (null == singleton) {
			synchronized (Singleton.class) {
				if (null == singleton) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
