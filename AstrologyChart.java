public class AstrologyChart {
    
    // INSTANCE VARIABLES: scope = available everywhere in this class (file)
    private String name;
    private String birthdate; //Format: DDMMYYYY
    private String westZodiac;
    private String chineseZodiac;
    
    // CONSTRUCTOR: this will be used by others to construct an astrology chart
    public AstrologyChart(String bdate, String name) {

        /* TO DO: INITIALIZE the two appropriate INSTANCE VARIABLES here */
        this.name = name;
        this.birthdate = bdate;

        /* Let's get the the individual day, month, and year Strings out of 
         * the DDMMYY birthdate String.
         * 
         * Note: These are LOCAL VARIABLES and, unlike INSTANCE VARIABLES, they 
         * exist only between the open bracket { on line 10 and the  close 
         * bracket } on line 53 
         */
        String dayStr = bdate.substring(0,2);/* TO DO: Find way to extract just DD from birthdate */
        String monthStr = bdate.substring(2,4);/* TO DO: Find way to extract just MM from birthdate */
        String yearStr = bdate.substring(4,8);/* TO DO: Find way to extract just YY from birthdate */


        /* Now let's convert those individual date Strings to intergers
         * Because these were DECLARED inside this method (Constructor), these
         * are also LOCAL VARIABLES
         */ 
        int day = Integer.parseInt(dayStr);/* Find a way to convert dayStr to an int */
        int month = Integer.parseInt(monthStr);/* Find a way to convert monthStr to an int */
        int year = Integer.parseInt(yearStr);/* Find a way to convert yearStr to an int */


        /* Now we have everything we need to create our algorithm for setting
         * our western zodiac and our Chinese zodiac. However, instead of
         * typing out the algorithm inside this constructor, we're going to type
         * it inside a METHOD of this class and then CALL that method to do the
         * work! That method should RETURN (proffer) something that we can then
         * store in something whose SCOPE ("life-span") lives within this whole
         * class (not just inside this constructor). That thing is...an INSTANCE
         * VARIABLE! 
         * 
         * Now, because 'day', 'month', and 'year' from lines 31-33 only live 
         * inside the scope of this constructor (they're LOCAL VARIABLES), we 
         * need to PASS these values on to the METHOD that will do the 
         * algorithmic work of setting the zodiac.
         */
        westZodiac = setWestSign(day, year);
        chineseZodiac = setChineseSign(year);//TO DO     
    }
    
    /* Wait what?! Why is 'day' and 'year' here?! Are they the same as the ones
     * above?! ---> No. Remember that the LOCAL VARIABLES die when they go "out
     * of scope". 'day' and 'year' from above died in the closing bracket on
     * line 53 so we can reuse those names here without problem! The 'day' and
     * 'year' paramater variables here are also LOCAL VARIABLES. They get
     * assigned whatever value is provided to them when this METHOD is CALLED. 
     * We CALL this method once on line 50. So, one the back-end (i.e. you never
     * need to type this out), the computer does this:
     * 
     * day = day<but the one from line 50>;
     * year = year<but the one from line 50>;
     * 
     * So, when writing your methods, you can always just assume that the
     * PARAMETERS have already been INITIALIZED (i.e that they have a value).
     */ 
    public String setWestSign(int day, int month) {
        switch(month){
            case 1:
            if(day>=1&&day<=19){
                return "Capricorn";
            }else if(day>=20 && day<=31){
                return "Aquarius";
            }
            
            case 2:
            if(day>=1&&day<=19){
                return "Aquarius";
            }else if (day>=20 && day<=28);{
                return "Pisces";
            }
            case 3:
                if(day <= 20 && day >= 1)
                    return "Pisces";
                else if(day >= 21 && day <= 31)
                   return "Aries";

            case 4:
                if(day <= 19 && day >= 1)
                    return "Aries";
                else if(day >= 20 && day <= 30)
                   return "Taurus";
            
            case 5:
                if(day <= 20 && day >= 1)
                    return "Taurus";
                else if(day >= 21 && day <= 31)
                   return "Gemini";

            case 6:
                if(day <= 20 && day >= 1)
                    return "Gemini";
                else if(day >= 21 && day <= 30)
                   return "Cancer";
            
            case 7:
                if(day <= 22 && day >= 1)
                    return "Cancer";
                else if(day >= 23 && day <= 31)
                   return "Leo";

            case 8:
                if(day <= 22 && day >= 1)
                    return "Leo";
                else if(day >= 23 && day <= 31)
                   return "Virgo";
            
            case 9:
                if(day <= 22 && day >= 1)
                    return "Pisces";
                else if(day >= 23 && day <= 30)
                   return "Libra";

            case 10:
                if(day <= 22 && day >= 1)
                    return "Libra";
                else if(day >= 23 && day <= 31)
                   return "Scorpio";
            
            case 11:
                if(day <= 21 && day >= 1)
                    return "Scorpio";
                else if(day >= 22 && day <= 30)
                   return "Sagittarius";
            
            case 12:
                if(day <= 21 && day >= 1)
                    return "Sagittarius";
                else if(day >= 22 && day <= 31)
                   return "Capricorn";
            
            default:
                return "Astrologically Unbound"; /* TO DO: algorithm for returning the right western zodiac as String  */
        }
    }

    

    public String setChineseSign(int year) {
        
        int remainder = year % 12;
        switch(remainder){
        case 0:
            return "Monkey";
        case 1:
            return "Rooster";
        case 2:
            return "Dog";
        case 3:
            return "Pig";
        case 4:
            return "Rat";
        case 5:
            return "Ox";
        case 6:
            return "Tiger";
        case 7:
            return "Rabbit";
        case 8:
            return "Dragon";
        case 9:
            return "Snake";
        case 10:
            return "Horse";
        case 11:
            return "Goat";

        default:
            return "Astrologically Unbound";

        }
        
        
        /* TO DO: same as setWestSign but for Chinese zodiac */
        
    }
    
    //TO DO: Implement all the methods as described in the prompt (lab02.md)
    
    
}
