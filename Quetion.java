public class Quetion 
{
    private int id;
    private String quetion;
    
    private String Option1;
    
    private String Option2;
    
    private String Option3;
    private String Option4;
    private String Answer;
    
    @Override
    public String toString() 
    {
        return "Quetion [id=" + id + ", quetion=" + quetion + ", Option1=" + Option1 + ", Option2=" + Option2
                + ", Option3=" + Option3 + ", Option4=" + Option4 + ", Answer=" + Answer + "]";
    }
    public Quetion(int id, String quetion, String option1, String option2, String option3, String option4,
            String answer) {
        this.id = id;
        this.quetion = quetion;
        Option1 = option1;
        Option2 = option2;
        Option3 = option3;
        Option4 = option4;
        Answer = answer;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getQuetion() {
        return quetion;
    }
    
    public void setQuetion(String quetion) {
        this.quetion = quetion;
    }
    public String getOption1() {
        return Option1;
    }
    public void setOption1(String option1) {
        Option1 = option1;
    }
    public String getOption2() {
        return Option2;
    }
    public void setOption2(String option2) {
        Option2 = option2;
    }
    public String getOption3() {
        return Option3;
    }
    public void setOption3(String option3) {
        Option3 = option3;
    }
    public String getOption4() {
        return Option4;
    }
    public void setOption4(String option4) {
        Option4 = option4;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setAnswer(String answer) 
    {
        Answer = answer;
    }

}
