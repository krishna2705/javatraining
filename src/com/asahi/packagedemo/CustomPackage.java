package com.asahi.packagedemo;

class CustomPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Custom Package");
        
        StringsDemo strdemo = new StringsDemo();
        strdemo.stringExamples();
        strdemo.stringBufferExamples();
        
        //Encapsulation Demo
        EncapsulationDemo ecap = new EncapsulationDemo();
        ecap.setStudentInfo(1000, "Krishna", "Gandhipuram");
        String studentInfo = ecap.getStudentInfo();
        System.out.println("Student Information " + studentInfo);
        
        //StaticClass Demo
        StaticClassDemo stat = new StaticClassDemo();
        stat.instanceMethod();
        
        StaticClassDemo.staticMethod(stat);
        
        RandomClassDemo singleObj = RandomClassDemo.getInstance();
        /*RandomClassDemo.method();
        RandomClassDemo.method();*/
        
        if(singleObj instanceof RandomClassDemo)
            System.out.println("Class is Singleton");
        else
            System.err.println("Class not singleton");
        
        APIResponseParser apiRes = new APIResponseParser();
        apiRes.accessApiResponse();
        
        APIResParse apiResVal = new APIResParse();
        
        
        
	}

}
