package com.xing.writer_;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        //bufferedReader_.readFiles(10);
        bufferedReader_.readFile();
        //Serializable
        //Externalizable
        //objectInputStream
        //objectOutputStream

        //这次希望通过 BufferedReader_多次读取字符串
        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        bufferedReader_2.readStrings(5);


    }
}
