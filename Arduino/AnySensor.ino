#include <SoftwareSerial.h>

SoftwareSerial mySerial(10, 11);

int pin13 = 7;
int ledPin = 13;
int buzzer = 6;
//int sensor = A0;
//const int soundPin = A2;
const int threshold = 1000;
int cry = 0;



void setup() {
  
  mySerial.begin(9600);
  Serial.begin(9600);
  pinMode(pin13, OUTPUT);
  pinMode(pin13, LOW);
  pinMode(buzzer, OUTPUT);
  pinMode(ledPin, OUTPUT);
  pinMode(A2, INPUT);


  beep(50);
  beep(200);
  beep(50);
  beep(100);
}

void loop() {

  
  
  
  int sensorValue = analogRead(A0);
  int soundsens = analogRead(A2);
  
  int outputvalue = map(sensorValue, 0, 1023, 0, 255);
  int outputMap2 = 0;
  int outputBuzzer = 0;
 
  
  if (sensorValue > 280) {
    outputMap2 = map(outputvalue, 70, 110, 0, 255);
    outputMap2 = constrain(outputMap2, 0, 255);
    outputBuzzer = 254 - map(outputvalue, 70, 110, 50, 254);
    analogWrite(pin13, outputMap2);
    beep(outputBuzzer);
    mySerial.print(sensorValue);
    digitalWrite(pin13, HIGH);
  }
  else {

    analogWrite(pin13, 0);
    mySerial.print(sensorValue);
    digitalWrite(pin13, LOW);
  }
  Serial.print("sensorValue : ");
  Serial.print(sensorValue, DEC);
  Serial.print("\t mapValue : ");
  Serial.print(outputvalue, DEC);
  Serial.print("\t outputMap2 : ");
  Serial.println(outputMap2, DEC);
  
  delay(3000);

  

  
  
//  if (soundsens >= threshold)
//  {
//    for (int i=0; i<10; i++){
//      if (soundsens >= threshold){
//        cry++;
//      }
//      
//    }
//    if (cry>=9){
//      digitalWrite(ledPin, HIGH);
//      
//      Serial.print("Voiceeeee : ");
//      Serial.println(soundsens);
//      delay(1000);
//      cry = 0;
//    }
//    
//  }
//  else
//  {
//    digitalWrite(ledPin, LOW);
//    Serial.print("Voiceeee :");
//    Serial.println(soundsens);
//    delay(500);
//  }
  
}

void beep(unsigned char delayms) {
  analogWrite(buzzer, 150);
  delay(delayms);
  analogWrite(buzzer, 0);
  delay(delayms);
}
