class Solution {
    long[][] ranges = {
            {0, 0, 0},                              // Skip 0-digit number
            {1, 9, 9},                              // 1-digit numbers
            {10, 99, 180},                          // 2-digit numbers
            {100, 999, 2700},                       // 3-digit numbers
            {1000, 9999, 36000},                    // 4-digit numbers
            {10000, 99999, 450000},                 // 5-digit numbers
            {100000, 999999, 5400000},              // 6-digit numbers
            {1000000, 9999999, 63000000},           // 7-digit numbers
            {10000000, 99999999, 720000000},        // 8-digit numbers
            {100000000, 999999999, 8100000000L}     // 9-digit numbers
    };
    public int findNthDigit(int n) {
        /*
            <---- Key Idea ----->
            0.  Build total possible ranges array which consist [<Start Value>,<End Value>,<Total Digit>]
            1.  Find Position of nth digit between ranges array.
                -   For this use digits counter.
                -   Basically u have to move digit by digit.
                    a.  Ex go and check "nth" digit lies between given range
                        ->  If yes end the loop
                        ->  Else remove total number of digits from n.
                            -   Like this: "positionInRange -= ranges[totalDigits][2];"
            2.  Find total number of digits
            3.  Find the startIndex in which i.e starting value in which that nth digit lies
            4.  Find that nth number.
                -   Use  number = startIndex + (positionInRange - 1) / totalDigits;
            5.  Find index of nth digit in "number" found above.
            6.  Convert number to string and char present at index found above as a int.
            7.  Complete Dry Run
            
                Ex. n = 11
                ->  11 lies in 10-99 range  
                ->  It means we have to remove all the digits before 2 digits numbers
                        =>  positionInRange = 11 - 9 - 0 = 2
                ->  Now we have totalDigits = 2, positionInRange = 2.
                ->  Find number in which digit is present.
                        =>  startIndex = ranges[totaldigits][0]
                        =>  long number = startIndex + (positionInRange - 1) / totalDigits;
                        =>  startIndex = 10
                        =>  number = 10 + (2-1)/2 = 10;
                ->  Find Digit Index In Number
                        =>  digit_Index_In_Number = (positionInRange - 1) % totalDigits;
                        =>  digit_Index_In_Number = (2-1)%2 = 1
                ->  Convert nunber found to string and return "digit_Index_In_Number" indexed number as a int.
        */
        int totalDigits = 1; // Total Number of digits
        int positionInRange = n;
        while (totalDigits < ranges.length && positionInRange  > ranges[totalDigits][2]){
            positionInRange -= ranges[totalDigits][2];
            totalDigits++; 
        }
        
        long startIndex = ranges[totalDigits][0];

        long number = startIndex + (positionInRange - 1) / totalDigits; // Number in which nth digit is present.
        
        int digit_Index_In_Number = (positionInRange - 1) % totalDigits;

        String s = Long.toString(number);

        int result = s.charAt(digit_Index_In_Number) - '0';

        return result;
    }
}