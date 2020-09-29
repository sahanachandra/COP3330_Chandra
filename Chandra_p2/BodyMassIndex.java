public class BodyMassIndex {

    public double index;       
    public String category;     
    //Data for other classes
    public BodyMassIndex(double height, double weight) {
        index = FindIndex(height, weight);
        category = FindCategory(index);
    }
    public String FindCategory(double index){  //Assigns a category.
        if(index < 18.5)        return "You are underweight.Go to your doctor.";
        if(index < 25)          return "You are normal :)";
        if(index < 30)          return "You are overweight.Go to your doctor.";
                                return "You are obese.Go to your doctor.";
    }
    public double FindIndex(double height, double weight){
         return Math.round(7030.0 * weight / (height * height))/10.0;//Calculates BMI PRECISELY LIKE THE OG CALC
    }
}
