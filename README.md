# Kanye West Quote Quarkus Example
```
                                                                              
                                     %&&&%%%                                 
                                   %#((#%%%&&*                               
                                  &(#(*,.,*/#((%                               
                                  %((/,,,,*(#(#%                               
                                  *&&&*,.,*/(((%                               
                                  (%,@%%*%(@%#(#*                              
                                  (***(**(*//(((                               
                                  #(*,,*,*,*/#(.                               
                                  ((#/%*/%/((#(.                               
                                   #%//./(####                                 
                               ,&&&&%&%#&&@%%@@                                
                          &&&&@@@@&%%@@@@@@#&@@@&&                             
                      &@@@@&@@@@@&%####%###%@&@@@&@&&                          
                     &&&@@@&&&&&&&%/*****/(@&&&&@&&&&&&&                       
                    ,&@@@&&&&&%&&&&@&****@@&%&&&@&&&&&&&&&                     
                    &&@@@@&@@@@%&&&&@@@@@@&%&%%%&&&&&&&&&&&                    
                    &@@@@@&&@@@%%%%&@@@@&@&&&%&&&&&&&&@@@&&                    
                   @&@@@@@@@@&@%%%%&&@@@&@%&&&&&&@@&@@&@@&&                    
                   &@@@@@@@@@&@%%%%&@@&&@%&&&%&&@&&&@@&&@@&                    
                   @@@@@@@@@@@@@&%&&@@&&&&&&%%&&@@@@@@@@@@@                    
                   @@@@@@@@@@@@@&%&&@@@@%&&%@@@@@@@@@@@@@@,                    
```
This is a sample application demonstrating how to use Quarkus to build a native executable. 
To build

```
gradle clean buildNative
```

Once a native executable has been generated, run the following Doccker-compose command to build and run
```
docker-compose build && docker-compose up
```
To test the application run:
```
curl http://localhost:8999/quote
```
This will return a rather insightful Kanye quote, using the excellent [api.kanye.rest](https://github.com/ajzbc/kanye.rest) service.
```

```
