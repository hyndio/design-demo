# java IO三个关键知识点

	来源：http://bohu83.blog.163.com/blog/static/354175652007911620724/
	
## 知识点一: 四大等级结构

	java语言的i/o库提供了四大等级结构:InputStream,OutputStream,Reader,Writer四个系列的类。
	InputStream和OutputStream处理8位字节流数据, Reader和Writer处理16位的字符流数据。
	InputStream和Reader处理输入, OutputStream和Writer处理输出。
	大家一定要到J2SE文档中看看这四大等级结构的类继承体系。
	
	除了这四大系列类,i/o库还提供了少数的辅助类,其中比较重要的是InputStreamReader和OutputStreamWriter。
	InputStreamReader把InputStream适配为Reader, OutputStreamWriter把OutputStream适配为Writer;
	这样就架起了字节流处理类和字符流处理类间的桥梁。
	
	您使用i/o库时,只要按以上的规则,到相应的类体系中寻找您需要的类即可。

## 知识点二: 适配功能

	java i/o库中的继承不是普通的继承;它的继承模式分为两种,其一就是Adapter模式 。
	下面以InputStream类体系为例进行说明。
	
	InputStream有7个直接子类:
	ByteArrayInputStream, FileInputStream, PipedInputStream, StringBufferInputStream;(这四个采用了Adapter模式)
	FilterInputStream, ObjectInputStream和SequenceInputStream.
	
	我们学习i/o库时,主要应该掌握这四个对象Adapter模式的适配源: 
	ByteArrayInputStream的适配源是Byte数组, 
	FileInputStream的适配源是File对象, 
	PipedInputStream的适配源是PipedOutputStream对象,
	StringBufferInputStream的适配源是String对象。
	其它三个系列类的学习方法与此相同。

## 知识点三: Decorator功能

	InputStream的其它三个直接子类采用的是Decorator模式:
	(FilterInputStream, ObjectInputStream和SequenceInputStream.)
 