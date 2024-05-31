var student = { id: "1", name:"jagadeesh", age:23, marks:{english:34, maths:56},//marks:[34, 56, 78] ,
                read:function(){
                    console.log("jagadeesh is reading...");
                },
                write:function(){
                    console.log("jagadeesh is writing...");
                }
            };
            //console.log(student);
           //console.log (student.marks[0]);
           //console.log(student.marks[2]);
            console.log(student.marks.english);
            console.log(student.marks.maths);