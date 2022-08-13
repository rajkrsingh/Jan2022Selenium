pipeline{
agent any
    stages{
        
        stage("Build"){
            
            steps{
                echo "Building"
            }
        }
        
        stage("Deploy on dev"){
            
            steps{
                echo "Deploy on Dev"
            }
        } 
        stage("Deploy on QA"){
            
            steps{
                echo "Deploy on QA"
            }
        }
        stage("Sanity Test"){
            
            steps{
                echo "Sanity Test on QA"
            }
        } 
        stage("Regression Test"){
            
            steps{
                echo "Regression Test on QA"
            }
        }    
        stage("Staging Deployment"){
            
            steps{
                echo "Deploy on Staging"
            }    
        }  
        
        stage("Sanity test on Staging"){
            
            steps{
                echo "Sanity test on Staging"
            }    
        } 
         stage("UAT test on Staging"){
            
            steps{
                echo "UAT test on Staging"
            }    
        } 
        
        stage("Prod Deployment"){
            
            steps{
                echo "Deployment on Prod"
            }    
        }    
        

        
    }

    
}