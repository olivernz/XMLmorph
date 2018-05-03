// XML converter script for test.xml file

class convert {

	def currentDate = new Date()
	def dateOffset = 0

	def convertXML(xml) {

		xml.@description = 'changed!'
		xml.testSub.@whatever = 101
    
    	xml.with {
      		testSub.@whatever = 1011
    	}
    
		xml.testSub[1].each {
			testSubSub.@really = 'changed!'
      		testSubSub.value = this.currentDate.format('dd-MM-yyyy')
	 	}
	 return xml
	}

}
