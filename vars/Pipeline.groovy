

def call(configs) {
	
	def MPL = MPLPipelineConfig(
				configs,
				[]
			)

		pipeline {
			agent any 
					stages { 
							stage ('Checking out') { 
								steps {
									echo 'checking out the code'
								}
							}
							stage ('Test') {
								steps {
									echo 'Testing the app'
								}
							}
							stage ('Build') { 
								steps {
									echo 'Building the app'
								}
							}
							stage ('Deploy') { 
								steps {
									echo 'Deploying the app'
								}
							}
					}   
		}
	
}
