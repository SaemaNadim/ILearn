package com.example.android.bvp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FaqActivity extends AppCompatActivity {

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_faq);
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("What does the Basic First Aid course teach students?", "Students will learn how to respond to common emergencies, including: cuts; burns; head, neck and back injuries; bleeding; sprains; broken bones; shock, and more. If you would like more information on Pediatric First Aid, we recommend taking the Pediatric First Aid course which includes common pediatric emergencies and prevention."));
        words.add(new Word("What does the Basic First Aid course content include?", "Course content includes: First aid basics including scene safety, finding the problem, and calling for help; Medical emergencies including actions for choking, breathing problems, shock, and more; Injury emergencies including actions for bleeding, broken bones, burns, and more; Environmental emergencies including actions for bites and stings, actions for heat stroke and hypothermia, and poison emergencies.  There is a written test at the end of the course."));
        words.add(new Word("Does the Basic First Aid course include CPR training?", "No, the Basic First Aid course does not include CPR, but students have the option to take the First Aid, CPR and AED Class which includes all 3 subjects. In addition to first aid knowledge, students will learn adult CPR and AED, child CPR and AED, and infant CPR and AED. You also have the option to take our Pediatric First Aid and CPR Class, which covers adult, child, and infant CPR while focusing on the most common pediatric first aid emergencies."));
        words.add(new Word("Who does mental illness affect?", "It is estimated that mental illness affects 1 in 5 adults in America, and that 1 in 24 adults have a serious mental illness. Mental illness does not discriminate; it can affect anyone, regardless of gender, age, income, social status, ethnicity, religion, sexual orientation, or background. Although mental illness can affect anyone, certain conditions may be more common in different populations "));
        words.add(new Word("Can people with mental illness recover?", "When healing from mental illness, early identification and treatment are of vital importance. Based on the nature of the illness, there are a range of effective treatments available. For any type of treatment, it is essential that the person affected is proactive and fully engaged in their own recovery process. "));
        words.add(new Word("What treatment options are available?", "Just as there are different types of medications for physical illness, different treatment options are available for individuals with mental illness. Treatment works differently for different people. It is important to find what works best for you or your child."));
        words.add(new Word("To what extent can parents depend on schools to teach sex education?", "Parents should begin the sex education process long before it starts in school. The introduction of formal sexual education in the classroom varies; many schools start it in the fifth or sixth grade — and some don't offer it at all."));
        words.add(new Word("At what age should girls be told about menstruation?", "Girls (and boys!) should have information about menstruation by about age 8. This is an area of intense interest to girls. Information about periods might be provided in school — and instructional books can be very helpful."));
        words.add(new Word("When should parents sit kids down for that all-important \"birds and bees\" talk?", "The \"big talk\" is a thing of the past. Learning about sex should not occur in one all-or-nothing session. It should be more of an unfolding process, one in which kids learn, over time, what they need to know. Questions should be answered as they arise so that kids' natural curiosity is satisfied as they mature."));
        words.add(new Word("What do you tell a very young child who asks where babies come from?", "Depending on the child's age, you can say that the baby grows from an egg in the mommy's womb, pointing to your stomach, and comes out of a special place, called the vagina. There is no need to explain the act of lovemaking."));

        WordAdaptor adapter = new WordAdaptor(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
