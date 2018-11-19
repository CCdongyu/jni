package pers.ccdongyu.jni;

public class JNITest {
  static {
    try{
      System.loadLibrary("JNI");
    }catch (Exception e){
      System.out.println(e);
    }
  }

  public native void sayHello();
  public static void main(String[] args){
    JNITest jniTest = new JNITest();
    jniTest.sayHello();
    //System.out.println(System.getProperty("java.library.path"));
  }
}
