package com.crio.codingame;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("AppTest")
public class AppTest {
    //Arrange
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("Integration Test #1")
    void runTest1(){

        //Arrange
        List<String> arguments= new ArrayList<>(List.of("INPUT_FILE=input.txt"));

        //Output Change Everytime so not possible to assert with that
		// String expectedOutput = "User [id=1, contests=[], name=Ross, score=1500]\n"+
        // "User [id=2, contests=[], name=Monica, score=1500]\n"+
        // "User [id=3, contests=[], name=Joey, score=1500]\n"+
        // "User [id=4, contests=[], name=Chandler, score=1500]\n"+
        // "Question [id=1, level=LOW, score=10, title=Question1]\n"+
        // "Question [id=2, level=LOW, score=20, title=Question2]\n"+
        // "Question [id=3, level=LOW, score=30, title=Question3]\n"+
        // "Question [id=4, level=LOW, score=40, title=Question4]\n"+
        // "Question [id=5, level=LOW, score=50, title=Question5]\n"+
        // "Question [id=6, level=LOW, score=60, title=Question6]\n"+
        // "Question [id=7, level=LOW, score=70, title=Question7]\n"+
        // "Question [id=8, level=LOW, score=80, title=Question8]\n"+
        // "Question [id=9, level=LOW, score=90, title=Question9]\n"+
        // "Question [id=10, level=LOW, score=100, title=Question10]\n"+
        // "Question [id=11, level=MEDIUM, score=110, title=Question11]\n"+
        // "Question [id=12, level=MEDIUM, score=120, title=Question12]\n"+
        // "Question [id=13, level=MEDIUM, score=130, title=Question13]\n"+
        // "Question [id=14, level=MEDIUM, score=140, title=Question14]\n"+
        // "Question [id=15, level=MEDIUM, score=150, title=Question15]\n"+
        // "Question [id=16, level=MEDIUM, score=160, title=Question16]\n"+
        // "Question [id=17, level=MEDIUM, score=170, title=Question17]\n"+
        // "Question [id=18, level=MEDIUM, score=180, title=Question18]\n"+
        // "Question [id=19, level=MEDIUM, score=190, title=Question19]\n"+
        // "Question [id=20, level=MEDIUM, score=200, title=Question20]\n"+
        // "Question [id=21, level=HIGH, score=210, title=Question21]\n"+
        // "Question [id=22, level=HIGH, score=220, title=Question22]\n"+
        // "Question [id=23, level=HIGH, score=230, title=Question23]\n"+
        // "Question [id=24, level=HIGH, score=240, title=Question24]\n"+
        // "Question [id=25, level=HIGH, score=250, title=Question25]\n"+
        // "Question [id=26, level=HIGH, score=260, title=Question26]\n"+
        // "Question [id=27, level=HIGH, score=270, title=Question27]\n"+
        // "Question [id=28, level=HIGH, score=280, title=Question28]\n"+
        // "Question [id=29, level=HIGH, score=290, title=Question29]\n"+
        // "Question [id=30, level=HIGH, score=300, title=Question30]\n"+
        // "[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]\n"+
        // "[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]\n"+
        // "[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16], Question [id=17, level=MEDIUM, score=170, title=Question17], Question [id=18, level=MEDIUM, score=180, title=Question18], Question [id=19, level=MEDIUM, score=190, title=Question19], Question [id=20, level=MEDIUM, score=200, title=Question20]]\n"+
        // "[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=10, level=LOW, score=100, title=Question10], Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16], Question [id=17, level=MEDIUM, score=170, title=Question17], Question [id=18, level=MEDIUM, score=180, title=Question18], Question [id=19, level=MEDIUM, score=190, title=Question19], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9], Question [id=20, level=MEDIUM, score=200, title=Question20], Question [id=21, level=HIGH, score=210, title=Question21]]\n"+
        // "Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]]"+
        // "Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]"+
        // "Contest [id=3, name=CRIODO3_CONTEST, level=MEDIUM, creator=Chandler, contestStatus=NOT_STARTED, questions=[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16]]]"+
        // "[Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]], Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]], Contest [id=3, name=CRIODO3_CONTEST, level=MEDIUM, creator=Chandler, contestStatus=NOT_STARTED, questions=[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16]]]]\n"+
        // "[Contest [id=3, name=CRIODO3_CONTEST, level=MEDIUM, creator=Chandler, contestStatus=NOT_STARTED, questions=[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16]]]]\n"+
        // "RegisterContestDto [contestName=CRIODO3_CONTEST, registerationStatus=REGISTERED, userName=Joey]RegisterContestDto [contestName=CRIODO2_CONTEST, registerationStatus=REGISTERED, userName=Joey]RegisterContestDto [contestName=CRIODO1_CONTEST, registerationStatus=REGISTERED, userName=Joey]RegisterContestDto [contestName=CRIODO2_CONTEST, registerationStatus=REGISTERED, userName=Chandler]RegisterContestDto [contestName=CRIODO2_CONTEST, registerationStatus=REGISTERED, userName=Ross]RegisterContestDto [contestName=CRIODO3_CONTEST, registerationStatus=NOT_REGISTERED, userName=Joey]\n"+
        // "[UserName:Ross [Questions: [Question [id=5, level=LOW, score=50, title=Question5], Question [id=10, level=LOW, score=100, title=Question10], Question [id=9, level=LOW, score=90, title=Question9], Question [id=4, level=LOW, score=40, title=Question4], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3]]]], [UserName:Monica [Questions: [Question [id=10, level=LOW, score=100, title=Question10], Question [id=9, level=LOW, score=90, title=Question9], Question [id=3, level=LOW, score=30, title=Question3], Question [id=2, level=LOW, score=20, title=Question2], Question [id=7, level=LOW, score=70, title=Question7]]]], [UserName:Joey [Questions: [Question [id=6, level=LOW, score=60, title=Question6], Question [id=3, level=LOW, score=30, title=Question3], Question [id=5, level=LOW, score=50, title=Question5], Question [id=4, level=LOW, score=40, title=Question4], Question [id=1, level=LOW, score=10, title=Question1], Question [id=9, level=LOW, score=90, title=Question9], Question [id=7, level=LOW, score=70, title=Question7], Question [id=2, level=LOW, score=20, title=Question2]]]], [UserName:Chandler [Questions: [Question [id=9, level=LOW, score=90, title=Question9], Question [id=8, level=LOW, score=80, title=Question8], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=1, level=LOW, score=10, title=Question1]]]]\n"+
        // "[User [id=4, contests=[Contest [id=3, name=CRIODO3_CONTEST, level=MEDIUM, creator=Chandler, contestStatus=NOT_STARTED, questions=[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16]]], Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Chandler, score=1700], User [id=2, contests=[Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Monica, score=1760], User [id=1, contests=[Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]], Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Ross, score=1790], User [id=3, contests=[Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]], Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]]], name=Joey, score=1820]]\n"+
        // "[User [id=3, contests=[Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]], Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]]], name=Joey, score=1820], User [id=1, contests=[Contest [id=1, name=CRIODO1_CONTEST, level=HIGH, creator=Ross, contestStatus=NOT_STARTED, questions=[Question [id=22, level=HIGH, score=220, title=Question22], Question [id=23, level=HIGH, score=230, title=Question23], Question [id=24, level=HIGH, score=240, title=Question24], Question [id=25, level=HIGH, score=250, title=Question25], Question [id=26, level=HIGH, score=260, title=Question26], Question [id=27, level=HIGH, score=270, title=Question27], Question [id=28, level=HIGH, score=280, title=Question28], Question [id=29, level=HIGH, score=290, title=Question29], Question [id=30, level=HIGH, score=300, title=Question30], Question [id=21, level=HIGH, score=210, title=Question21]]], Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Ross, score=1790], User [id=2, contests=[Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Monica, score=1760], User [id=4, contests=[Contest [id=3, name=CRIODO3_CONTEST, level=MEDIUM, creator=Chandler, contestStatus=NOT_STARTED, questions=[Question [id=11, level=MEDIUM, score=110, title=Question11], Question [id=12, level=MEDIUM, score=120, title=Question12], Question [id=13, level=MEDIUM, score=130, title=Question13], Question [id=14, level=MEDIUM, score=140, title=Question14], Question [id=15, level=MEDIUM, score=150, title=Question15], Question [id=16, level=MEDIUM, score=160, title=Question16]]], Contest [id=2, name=CRIODO2_CONTEST, level=LOW, creator=Monica, contestStatus=NOT_STARTED, questions=[Question [id=10, level=LOW, score=100, title=Question10], Question [id=1, level=LOW, score=10, title=Question1], Question [id=2, level=LOW, score=20, title=Question2], Question [id=3, level=LOW, score=30, title=Question3], Question [id=4, level=LOW, score=40, title=Question4], Question [id=5, level=LOW, score=50, title=Question5], Question [id=6, level=LOW, score=60, title=Question6], Question [id=7, level=LOW, score=70, title=Question7], Question [id=8, level=LOW, score=80, title=Question8], Question [id=9, level=LOW, score=90, title=Question9]]]], name=Chandler, score=1700]]";

        int expectedLength = 44;
        //Act
        App.run(arguments);
        // int count1 = outputStreamCaptor.toString().trim().compareTo("");
        // int count2 = expectedOutput.compareTo("");
        // int count = outputStreamCaptor.toString().trim().compareTo(expectedOutput);
        // System.out.println(count);

        //Assert
        Assertions.assertEquals(expectedLength, outputStreamCaptor.toString().trim().lines().count());
 
	}

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
    
}