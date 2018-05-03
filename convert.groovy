// XML converter script for test.xml file

class convert {

	def currentDate = new Date()
	def dateOffset = 0

	def convertXML(xml) {

		xml.@chamgeme 						      = 'changed!'
		xml.testSub.@number						  = 101
    
    xml.with {
      testSub.@number               = 1011
    }
    
		xml.testSub.with {
			testSubSub.@changeme2         = 'changed!'
      testSubSub                    = this.currentDate.format('dd/MM/yyyy')
	  }
	  return xml
	}

}
