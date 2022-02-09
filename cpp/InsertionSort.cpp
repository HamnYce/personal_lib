#include <iostream>
#include <string>
using namespace std;

typeOfReturn insertionSort(typeOf array) {
  //insertion sort method for arrays or string (i.e. array of chars)

  //my version of an insertion sort
  //change array.length to appropriate method for length..
  int x = 0,y = 0;  
  for (int i  = 1;i <(int)array.length();i++) {
    y = array[i];
    while (array[i] < array[i - x - 1] && x < i) {
      x++;
    }
    for (int j = 0;j<x;j++){
      array[i - j] = array[i - j - 1];
    }
    array[i-x] = y;
    x = 0;
  }
  return array;
}

