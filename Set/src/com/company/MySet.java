package com.company;

public class MySet {
    public int[] myArray;
     public int LastIndex;
     public MySet()
     {
      myArray=new int[8];//создаем массив для хранения элементов
      LastIndex=-1;//последний добпавленный элемент
     }
     public void Add(int b)//создаем функцию для добавления элемента
     {
         if (LastIndex == -1)//проверяем что нет элементов добавленных
         {
             ++LastIndex;
             myArray[LastIndex] = b;
         } else {
             for (int i = 0; i <= LastIndex; i++)//проходим по циклу(есть ли такой элемент)
             {
                 if (myArray[i] == b)//если такой элементт есть то  прерываем функцию
                 {
                     return;
                 }
             }
             if (LastIndex == myArray.length - 1)//проверяем что места нет
             {
                 int[] massiv = new int[myArray.length * 2];//создаем новый массив который больш чем старый
                 for (int j = 0; j <= LastIndex; j++)//проходим по старому массиву и записываем в новый
                 {
                     massiv[j] = myArray[j];
                 }
                 myArray = massiv;//в старый перезапитсали  новый
             }
             LastIndex++;
             myArray[LastIndex] = b;//записываем новый элемент в массив


         }

     }


     public void  remove(int n){//удаляет значение
       for(int i=0;i<=LastIndex;i++)
       {
           if(n==myArray[i])
           {
               for(int j=i;j<=LastIndex;j++)
               {
                   myArray[j]=myArray[j+1];//сдвигаем все элементы влево
               }
               LastIndex--;//уменьшаем колличество элементов
           }
       }
     }

     public MySet intersection(MySet v)//метод пересечения множеств(возвращает новое множество)
     {
         MySet m =new MySet();
         for(int i=0;i<= LastIndex;i++)//перебирает все элементы из текущего объекта
         {
             for(int j=0;j<= v.LastIndex;j++)//перебираем из переданного объекта
             {
                 if(myArray[i]==v.myArray[j])//если находим два одинаковых элемента то добавляем в новое множество
                 {
                     m.Add(myArray[i]);//добавляем во множество
                 }
             }
         }
         return m;//возвращаем новое множество
     }


     public boolean contains(int g)//есть ли такой элемент во множестве
     {
         for(int i=0;i<=LastIndex;i++)//перебираем все элементы
         {
             if(myArray[i]==g)//проверяем есть ли искомый элемент
             {
                 return true;
             }

         }
         return false;//если цикл закончился то эемента нету и возвращаем false
     }

       @Override
       public String toString()
       {
           String t="";
           for(int i=0;i<=LastIndex;i++)
           {
               t += myArray[i] + " ";
           }
           return t;
       }
}
