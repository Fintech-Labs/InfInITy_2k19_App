package com.rohanlekhwani.infinity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question__detail_view);
        final TextView qv=(TextView)findViewById(R.id.QuestionDetailText);
        qv.setMovementMethod(new ScrollingMovementMethod());
        Intent qd = getIntent();
        final int index = qd.getIntExtra("tk.kunalgohire.Question", -1);
        final Spanned bahubali = Html.fromHtml(
                "<h2>Bahubali<h2/>"+
                        "Kattapa, as you all know was one of the greatest" +
                        " warriors of his time. The kingdom of Maahishmati had never lost a battle" +
                        " under him (as army-chief), and the reason for that was their really " +
                        "powerful army, also called as Mahasena."+
                        "<br/>"+
                        "Kattapa was known to be a" +
                        " very superstitious person. He believed that a soldier is \"lucky\" if the " +
                        "soldier is holding an even number of weapons, and \"unlucky\" otherwise. " +
                        "He considered the army as \"READY FOR BATTLE\" if the count of \"lucky\" " +
                        "soldiers is strictly greater than the count of \"unlucky\" soldiers, " +
                        "and \"NOT READY\" otherwise."+"<br/>"+"Given the number of weapons" +
                        " each soldier is holding, your task is to determine whether the army formed" +
                        " by all these soldiers is \"READY FOR BATTLE\" or \"NOT READY\"."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "The first line of input consists of a " +
                        "single integer N denoting the number of soldiers. The second line of input " +
                        "consists of N space separated integers A1, A2, ..., AN, where Ai denotes " +
                        "the number of weapons that the ith soldier is holding.."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "Generate one line output saying \"READY FOR BATTLE\", if the army " +
                        "satisfies the conditions that Kattapa requires or \"NOT READY\" " +
                        "otherwise (quotes for clarity).."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+"Should contain all the constraints on the " +
                        "input data that you may" + " have. Format it like:"+
                        "<br/>"+
                        "<ul><li>1 ≤ N ≤ 100<li/><li>1 ≤ Ai ≤ 100<li/><ul/>"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "4" +"<br/>"+
                        "11 12 13 14" +
                        "<br/>" +"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "NOT READY"+
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned why_five = Html.fromHtml(
                "<h2>WHY FIVE<h2/>"+
                        "Pooja would like to withdraw X $US from an ATM. The cash machine will only " +
                        "accept the transaction if X is a 'Dhinchak' number. A Dhinchak number is a" +
                        " number which is a multiple of 5, and Pooja's account balance has enough " +
                        "cash to perform the withdrawal transaction (including bank charges). " +
                        "For each successful withdrawal the bank charges 5 $US. Calculate Pooja's " +
                        "account balance after an attempted transaction.."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "Positive integer 0 < X < = 2000 the amount of cash which Pooja wishes to " +
                        "withdraw.."+"<br/>"+
                        "Non-negative number 0 < = Y < = 2000 with two digits of precision  Pooja's " +
                        "initial account balance."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "Output the account balance after the attempted transaction. If there is not" +
                        " enough money in the account to complete the transaction, " +
                        "output the current bank balance.."+
                        "<br/>"+
                        "_____________________________"+

                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                          "30 120"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "85"+
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned triangle_trouble = Html.fromHtml(
                "<h2>Triangle Trouble<h2/>"+
                        "Himanshu loved Maths.His favorite topics were series and triangles. " +
                        "His friend Rohan gave him a series as follows."+"<br/>"+"7 , 31 , 71, 127," +
                        " 199, 287.."+"<br/>"+
                        "Create a triangle from the above pattern as shown in the output. Each row " +
                        "contains maximum elements as indicated by the row number. This means that " +
                        "the T th row will contain a maximum of T elements.To make the pattern " +
                        "difficult Rohan placed the following conditions:"+"<br/>"+"If a number " +
                        "in the pattern has less than 5 digits the number in the pattern will be " +
                        "filled with leading zeros so as to maintain the shape. If number has " +
                        "greater than or equal to 5 digits then output the number as such."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "One integer T denoting the row till which elements should be printed.."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                         "Required Pattern."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul><li>1 ≤ T ≤ 13<li/><ul/>"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "3"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "00007"+"<br/>"+"00031 00071"+"<br/>"+"00127 00199 00287"+
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned love_all_letters = Html.fromHtml(
                "<h2>Love All Letters<h2/>"+
                        "Sachin recently inherited an ancient papyrus that contained some text. " +
                        "Unfortunately, the text was not a PANGRAM (Google Meaning). Now, Sachin " +
                        "has a particular liking for holoalphabetic strings and the text bothers " +
                        "him. The good news is that Sachin can buy letters from the local store " +
                        "in order to turn his text into a pangram."+
                        "<br/>"+"However, each letter has a price and Sachin wants to minimize the" +
                        " cost. Can you help Sachin find the cheapest way to obtain a pangram? "+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "The first line of the input file will contain one integer, T, " +
                        "representing the number of tests.."+
                        "Each test will be formed from two lines. The first one contains 26 " +
                        "space-separated integers, representing the prices of all letters. " +
                        "The second will contain Sachin's initial text " +
                        "(a string of N lowercase letters).:"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "The output file will contain T lines, one for each test. Each line will " +
                        "contain the answer for the corresponding test."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "Should contain all the constraints on the input data that you may have. " +
                        "Format it like:"+
                        "<br/>"+
                        "<ul>" +
                        "<li>1 ≤ T ≤ 100<li/>" +
                        "<li>1 ≤ N ≤ 50,000<li/>" +
                        "<li>All prices are natural numbers between 1 and 1,000,000 (i.e. 106).<li/>"+
                        "<li>A pangram is a string that contains every letter of the Latin alphabet " +
                        "at least once.<li/>"+
                        "<li>All purchased letters are added to the end of the string.<li/>"+
                        "<ul/>"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "2"+
                        "<br/>"+
                        "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26"
                        +"<br/>"+
                        "abcdefghijklmopqrstuvwz"+"<br>"+
                        "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26"+
                        "<br/>"+"thequickbrownfoxjumpsoverthelazydog"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "63"+"<br/>"+"0"+"<br/>"+
                        "_____________________________"+
                        "<h4>Explanation<h4/>"+
                        "First test"+"<br/>"+"There are three letters missing from the original " +
                        "string: n (price 14), x (price 24), and y (price 25)."+"<br/>"+"Therefore" +
                        " the answer is 14 + 24 + 25 = 63."+"<br/>"+"<br/>"+
                        "Second test"+"No letter is missing so there is no point in buying " +
                        "something. The answer is 0."+"<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned caught_you = Html.fromHtml(
                "<h2>Caught You <h2/>"+
                        "Chef is at a Code Expo where many coders are present discussing, solving, " +
                        "sharing, and eavesdropping on solutions :P"+
                        "<br/>"+
                        "He recently learnt that a former HackerPlant employee, Nahor, who is now" +
                        " working at KodeKarma stole some questions for their KoolKontest." +
                        " Chef wants to find Nahor, but the only data he has on him, and " +
                        "everyone else present, are their CodeXP ratings, which are distinct. "+
                        "<br/>"+
                        "Chef decides to find Nahor through his rating by asking different people" +
                        " present at the expo. Everyone present are arranged in such a way that," +
                        " assuming a person with rating X, every person with a rating higher than" +
                        " X are on the person's right, while every person with a rating lower " +
                        "than X are on the person's left. "+
                        "<br/>"+
                        "Everyone present there knows Nahor's rating, except Chef, who now asks" +
                        " people where he could find Nahor."+
                        "<br/>"+
                        "Chef initially asks an arbitrary person, who replies by giving information" +
                        " on whether Nahor is to the person's left or the person's right, " +
                        "depending on whether this person has a higher or lower rating than Nahor. " +
                        "Chef proceeds in that direction for an arbitrary distance and stops and" +
                        " asks the next person encountered, and repeats this procedure. " +
                        "However, Chef will never go beyond a person whose rating Chef has" +
                        " asked before. For example, if Chef was walking to the left and finds" +
                        " a person who already told him to walk to the right then he will not" +
                        " continue going to the person's left. Chef finally finds Nahor" +
                        " when he finally stops in front of Nahor. "+
                        "<br/>"+
                        "During Chef's search for Nahor, he wrote the sequence of ratings of the " +
                        "people Chef asked in the exact same order, including Nahor's rating, " +
                        "which is the last integer in the sequence. Towards the end, " +
                        "Chef feels he might've made a mistake while writing this sequence."+
                        "<br/>"+
                        "Given the sequence that Chef wrote and Nahor's rating, find out " +
                        "whether this sequence is possible or has mistakes."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>First line contains number of test cases T.<li/>" +
                        "<li>The first line of each test case contains the number of people " +
                        "Chef meets, N and Nahor's rating R separated by a space.<li/>" +
                        "<li>Second line of each test case contains N number of space separated" +
                        " ratings from A1 to AN where AN is always equal to R.<li/>" +
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "For each test case, output a singe line with either \"YES\" if the " +
                        "sequence is correct, or print \"NO\" if the sequence has mistakes, " +
                        "without quotes."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul>" +
                        "<li>1 ≤ T ≤ 50<li/>"+
                        "<li>1 ≤ N ≤ 10^6<li/>"+
                        "<li>1 ≤ sum ofNin all test cases ≤ 1.5*10^6<li/>"+
                        "<li>1 ≤ Ai ≤ 10^9<li/>"+
                        "<li>Integers in A are distinct<li/>"+
                        "<li>A[n]=R<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "2"+"<br/>"+
                        "5 200"+"<br/>"+
                        "600 300 100 350 200"
                        +"<br/>"+
                        "5 890"+"<br/>"+
                        "5123 3300 783 1111 890"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "NO"+
                        "<br/>"+
                        "YES"+
                        "<br/>"+
                        "<br/>"+"<br/>"+"<br/>"
        );
        Spanned the_ego_stone = Html.fromHtml(
                "<h2>The Ego Stone<h2/>"+
                        "All submissions for this problem are available.There are 6 Infinity" +
                        " Stones in the Marvel Universe -"+"<br/>"+
                        "SoulStone, TimeStone, SpaceStone, MindStone, RealityStone, PowerStone."+
                        "<br/>"+
                        "It is said that there is a 7th Infinity Stone - The Ego Stone that doesn't" +
                        " appear in Marvel Cinematic Universe (MCU). Thanos is a really ambitious " +
                        "person and has set his eyes on it but in order to obtain that " +
                        "stone he needs to solve a problem and you have to help him out."+
                        "<br/>"+
                        "Thanos needs to find an InfinityMatrix of order N. A matrix that has Sum" +
                        " of each Row = Sum of each Column = Sum of each diagonal = S (a constant)," +
                        " is called as an InfinityMatrix by Thanos. The Infinity Matrix has all " +
                        "distinct elements in the range 1 and n^2."+
                        "<br/>"+
                        "For any NXN matrix obtain the sum S."
                        +"<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>First line will contain T, number of testcases. Then the testcases " +
                        "follow.<li/>"+
                        "<li>Each testcase contains of a single line of input,one integer N which" +
                        " is the order of the matrix.<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "For each testcase, output in a single line S the sum."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul>" +
                        "<li>1 ≤ T ≤ 1000<li/>"+
                        "<li>3 ≤ N ≤ 62600<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "1"+"<br/>"+
                        "3"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "15"+
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned skip_it = Html.fromHtml(
                "<h2>Skip It!<h2/>"+
                        "Two things Rob the rabbit loves the most is eating carrots and jumping." +
                        " So his friend Tom arranged a game for him to play which involves both" +
                        " jumping and carrots."+"<br/>"+
                        "Tom arranged N stones in front of Rob for him to jump upon. On each stone," +
                        " Tom placed some carrots for Rob to collect. To complete the Game Tom " +
                        "arranged few rules for Rob. Rob must do the following things :"+
                        "<ol>" +
                        "<li>Always start with 1'st stone.<li/>"+
                        "<li>Skip the next k consecutive stones and then land upon the next stone.<li/>"+
                        "<li>Collect all the carrots from the stones he landed upon.<li/>"+
                        "<ol/>"+
                        "In the end, Rob has to tell Tom the total number of carrots he has." +
                        " Since Rob is weak at Maths (because he is a rabbit !), you have" +
                        " to calculate this number for him."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>The first line will contain an Integer T, denoting Number of test cases.<li/>"+
                        "<li>The first line of each test-case contains two space-separated " +
                        "integers N and Q denoting the number of stones and number of queries.<li/>"+
                        "<li>The second line of each test-case contains N-space separated " +
                        "integers denoting carrots on each stone.<li/>"+
                        "<li>The following Q lines contain an integer k, denoting the number" +
                        " of stones he skips every time he lands on a stone.<li/>"+
                        "<ul/>"+
                        "(Each query need not be distinct from others)."+"<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "For each query, output the number of carrots that Rob will have at the end."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul>" +
                        "<li>1 ≤ T ≤ 5<li/>"+
                        "<li>1 ≤ N ≤ 10^5<li/>"+
                        "<li>1 ≤ Q ≤ 10^5<li/>"+
                        "<li>0 ≤ k < N<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "1"
                        +"<br/>"+
                        "5 6"
                        +"<br/>"+
                        "3 7 4 2 1"
                        +"<br/>"+
                        "3"
                        +"<br/>"+
                        "1"
                        +"<br/>"+
                        "4"
                        +"<br/>"+
                        "3"
                        +"<br/>"+
                        "2"
                        +"<br/>"+
                        "0"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "4"
                        +"<br/>"+
                        "8"
                        +"<br/>"+
                        "3"
                        +"<br/>"+
                        "4"
                        +"<br/>"+
                        "5"
                        +"<br/>"+
                        "17"
                        +
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned pari_n_prime = Html.fromHtml(
                "<h2>Pari N Prime<h2/>"+
                        "Pari loves prime numbers, in her free time she likes to calculate the sum" +
                        " of all distinct prime factors of a given number. But her elder sister" +
                        " asked her to find the same on a given range and then add all the sums." +
                        " Since Pari is busy these days, she asks for your help."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>First line will contain T, number of Test Cases.<li/>"+
                        "<li>Each Test case contains of a single line of input, two space " +
                        "separated integers l,r<li/>"+
                        "<ul/>"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "For each Test Case output in a single line, the answer % ( 10^9+7 )."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul>" +
                        "<li>1 ≤ T ≤ 10<li/>"+
                        "<li>1 ≤ l ≤ r ≤ 10^6<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                         "2"
                        +"<br/>"+
                        "2  6"
                        +"<br/>"+
                        "10  15"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "<br/>"+
                        "17 "+
                        "<br/>"+
                        "53"+
                        "<br/>"+"<br/>"+"<br/>"+"<br/>"
        );
        Spanned simple_series = Html.fromHtml(
                "<h2>Simple Series<h2/>"+
                        "All submissions for this problem are available.Satyam Loves to play with " +
                        "various series. Today he came across a new series: 5,8,11,14,17........ " +
                        "His brother came along and asks him certain queries about this series." +
                        " Description of the queries is as follows:- Given a range [l,r], " +
                        "he asks Satyam to find all numbers X belonging to the series and which" +
                        " lie in [l,r] and output summation of XX. Formally, Assume X1,X2,....,Xn " +
                        "lies in [l,r] and X1,X2,....Xn lies in series. Then output should be"+"<br/>"+
                        "pow(X1,X1)+pow(X2,X2)+......+pow(Xn,Xn)."+"<br/>"+"pow() = Power Operation."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>The first line will contain an Integer Q, number of Queries.<li/>"+
                        "<li>Each Query contains a single line of input, two space separated" +
                        " integers l,r.<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "<ul>" +
                        "<li>For each Query output a single line, the answer.<li/>"+
                        "<li>Since it can be large, output answer modulo ( 10^9+7 ).<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+
                        "<ul>" +
                        "<li>1 ≤ Q ≤ 10^5<li/>" +
                        "<li>1 ≤ l ≤ r ≤ 10^5<li/>" +
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "2"
                        +"<br/>"+
                        "1  7"
                        +"<br/>"+
                        "11  18"
                        +"<br/>"+"<br/>"+
                        "Output:"
                        +"<br/>"+
                        "3125"
                        +"<br/>"+
                        "714414095"
                        +"<br/>"+
                        "<br/>"+"<br/>"+"<br/>"
        );
        Spanned distributing_chocolates = Html.fromHtml(
                "<h2>Distributing Chocolates<h2/>"+
                        "On the occasion of many upcoming festivals, Principal Manali decided to" +
                        " give chocolates to all the students in the school. There are a" +
                        " total of N students in the school. During distribution of chocolates," +
                        " however, some students got less chocolates as compared to others. " +
                        "Now since some children were unhappy, she decided to give everyone " +
                        "a chance to trade chocolates. The trading takes place in the following manner:"+
                        "<br/>"+
                        "All the students are arranged in a straight line. Each student is given" +
                        " a chance to trade chocolates with any student within his/her vision." +
                        " But since everyone is greedy, any student will always choose to trade" +
                        " with the student having the highest number of chocolates in his/her" +
                        " vision. (If he/she himself has the maximum number of chocolates" +
                        " in his/her vision, he/she will not get any more chocolates.)"+
                        "<br/>"+
                        "The vision of each i-th student is given by b[i], which means that the" +
                        " student standing at i-th position can see atmost b[i] students in" +
                        " front and behind of him. For example, if there are 6 students and if" +
                        " the vision of student standing at position=2 is 3, he/she can only " +
                        "see the students at position=1, position=3, position=4, position=5 only." +
                        " He cannot see the student at 6-th position."+
                        "<br/>"+
                        "Once he has found out the student which has the maximum number of " +
                        "chocolates according to the above conditions, he/she gets one-third of" +
                        " the difference (floor value) of chocolates from the student having the" +
                        " maximum number of chocolates."+
                        "<br/>"+
                        "But here comes the catch! If there are multiple students in his vision," +
                        " who have this maximum amount of chocolates, he will not get " +
                        "chocolates from any of them. The trading starts with the leftmost" +
                        " student (student at position-1). After all the trading is done, " +
                        "Manali is interested in finding how many chocolates do each of the" +
                        " students have. Please help her in solving this problem."+
                        "<br/>"+
                        "(floor value:- Greatest integer value)"+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Input<h4/>"+
                        "<ul>" +
                        "<li>The first line of input contains an integer N, denoting the number of students.<li/>"+
                        "<li>The second line of input contains N space separated integers A[i], " +
                        "denoting the initial number of chocolates that each student has.<li/>"+
                        "<li>The third line of input contains N space separated integers B[i], " +
                        "denoting vision of each student.<li/>"+
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Output<h4/>"+
                        "Print N space separated integers A[1],..,A[i],A[i+1]...A[n], representing" +
                        " the chocolates each student has after the trading has been completed."+
                        "<br/>"+
                        "_____________________________"+
                        "<h4>Constraints<h4/>"+

                        "<ul>" +
                        "<li>1 ≤ N ≤ 10^5<li/>" +
                        "<li>1 ≤ A[i] ≤ 10^8<li/>" +
                        "<li>1 ≤ B[i] < N<li/>" +
                        "<ul/>"+
                        "_____________________________"+
                        "<h4>Example<h4/>"+
                        "Input:"
                        +"<br/>"+
                        "3"
                        +"<br/>"+
                        "5  16  4"
                        +"<br/>"+
                        "2  2  1"
                        +"<br/>"+"<br/>"+
                        "Output:"+"<br/>"+
                        "8  10  7"
                        +"<br/>"+
                        "<br/>"+"<br/>"+"<br/>"
        );
        if(index==0)
        {
            qv.setText(bahubali);
        }
        else if(index==1)
        {
            qv.setText(why_five);
        }
        else if(index==2)
        {
            qv.setText(triangle_trouble);
        }
        else if(index==3)
        {
            qv.setText(love_all_letters);
        }
        else if(index==4)
        {
            qv.setText(caught_you);
        }
        else if(index==5)
        {
            qv.setText(the_ego_stone);
        }
        else if(index==6)
        {
            qv.setText(skip_it);
        }
        else if(index==7)
        {
            qv.setText(pari_n_prime);
        }
        else if(index==8)
        {
            qv.setText(simple_series);
        }
        else if(index==9)
        {
            qv.setText(distributing_chocolates);
        }
        Button solutionbtn=(Button)findViewById(R.id.SolutionBtn);

        solutionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new  Intent(getApplicationContext(),Solution.class);
                n.putExtra("tk.kunalgohire.Solution",index);
                startActivity(n);
            }
        });
    }
}
