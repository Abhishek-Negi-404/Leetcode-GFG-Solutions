# Help Classmates
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px"><nr-sentence class="nr-selected-post nr-s1" id="nr-s1" page="0">Professor X wants his students to help each other in the chemistry lab.</nr-sentence><nr-sentence class="nr-selected-post nr-s2" id="nr-s2" page="0"> He suggests that every student should help out a classmate who scored less marks than him in chemistry and whose roll number appears after him.</nr-sentence><nr-sentence class="nr-selected-post nr-s3" id="nr-s3" page="0"> But the students are lazy and they don't want to search too far.</nr-sentence><nr-sentence class="nr-selected-post nr-s4" id="nr-s4" page="0"> They each pick the first roll number after them that fits the criteria.</nr-sentence><nr-sentence class="nr-selected-post nr-s5" id="nr-s5" page="0"> Find the marks of the classmate that each student picks.</nr-sentence><br>
<strong><nr-sentence class="nr-selected-post nr-s5" id="nr-s5" page="0">Note:</nr-sentence></strong><nr-sentence class="nr-selected-post nr-s5" id="nr-s5" page="0"> one student may be selected by multiple <nr-word class="nr-s5w18">classmates</nr-word>.</nr-sentence></span></p>

<p><span style="font-size:18px"><strong><nr-sentence class="nr-s6" id="nr-s6" page="0">Example 1:</nr-sentence></strong></span></p>

<pre><span style="font-size:18px"><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Input: </nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0">N = 5, arr[] = {3, 8, 5, 2, 25}
</nr-sentence><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0"> 2 5 2 -1 -1
</nr-sentence><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0"> 
1.</nr-sentence><nr-sentence class="nr-s8" id="nr-s8" page="0"> Roll number 1 has 3 marks.</nr-sentence><nr-sentence class="nr-s9" id="nr-s9" page="0"> The first person 
who has less marks than him is roll number 4, 
who has 2 marks.</nr-sentence><nr-sentence class="nr-s10" id="nr-s10" page="0">
2. Roll number 2 has 8 marks, he helps student 
with 5 marks.</nr-sentence><nr-sentence class="nr-s11" id="nr-s11" page="0">
3. Roll number 3 has 5 marks, he helps student 
with 2 marks.</nr-sentence><nr-sentence class="nr-s12" id="nr-s12" page="0">
4. Roll number 4 and 5 can not pick anyone as 
no student with higher roll number has lesser 
marks than them.</nr-sentence><nr-sentence class="nr-s13" id="nr-s13" page="0"> This is denoted by -1.</nr-sentence><nr-sentence class="nr-s14" id="nr-s14" page="0">
Output shows the marks of the weaker student that 
each roll number helps in order.</nr-sentence><nr-sentence class="nr-s15" id="nr-s15" page="0"> ie- 2,5,2,-1,-1</nr-sentence></span></pre>

<p><br>
<span style="font-size:18px"><strong><nr-sentence class="nr-s16" id="nr-s16" page="0">Example 2:</nr-sentence></strong></span></p>

<pre><span style="font-size:18px"><strong><nr-sentence class="nr-s17" id="nr-s17" page="0">Input: </nr-sentence></strong><nr-sentence class="nr-s17" id="nr-s17" page="0">N = 4, a[] = {1, 2, 3, 4}
</nr-sentence><strong><nr-sentence class="nr-s17" id="nr-s17" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s17" id="nr-s17" page="0"> -1 -1 -1 -1&nbsp;
</nr-sentence><strong><nr-sentence class="nr-s17" id="nr-s17" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-s17" id="nr-s17" page="0"> As the marks ars in increasing order.</nr-sentence><nr-sentence class="nr-s18" id="nr-s18" page="0"> 
None of the students can find a classmate who has 
a higher roll number and less marks than them.</nr-sentence>
</span></pre>

<p><span style="font-size:18px"><strong><nr-sentence class="nr-s19" id="nr-s19" page="0">Your Task: </nr-sentence></strong>&nbsp;<br><nr-sentence class="nr-s19" id="nr-s19" page="0">
You don't need to read input or print anything.</nr-sentence><nr-sentence class="nr-s20" id="nr-s20" page="0"> Complete the function </nr-sentence><strong><nr-sentence class="nr-s20" id="nr-s20" page="0">help_classmate()</nr-sentence></strong><nr-sentence class="nr-s20" id="nr-s20" page="0"> which takes the array arr[] and&nbsp;size of array N as input parameters and returns a list of numbers.</nr-sentence><nr-sentence class="nr-s21" id="nr-s21" page="0"> If a student is unable to find anyone then output is&nbsp;-1.</nr-sentence></span></p>

<p><span style="font-size:18px"><strong><nr-sentence class="nr-s22" id="nr-s22" page="0">Expected Time Complexity:</nr-sentence></strong><nr-sentence class="nr-s22" id="nr-s22" page="0"> O(N)</nr-sentence><br>
<strong><nr-sentence class="nr-s22" id="nr-s22" page="0">Expected Auxiliary Space:</nr-sentence></strong><nr-sentence class="nr-s22" id="nr-s22" page="0"> O(N)</nr-sentence></span></p>

<p><span style="font-size:18px"><strong><nr-sentence class="nr-s23" id="nr-s23" page="0">Constraints:</nr-sentence></strong><br><nr-sentence class="nr-s23" id="nr-s23" page="0">
1 ≤ N ≤ 5*10</nr-sentence><sup>5</sup></span></p>
</div>