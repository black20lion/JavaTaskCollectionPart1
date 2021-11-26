Лабораторная работа по коллекциям
Выполнил: Сахокия Константин

Целью данного исследования было изучение работы Collection Framework
стандартной библиотеки java.util и практическое определение 
скорости работы основных коллекций на операциях добавления,
вставки и удаления элементов. Также одной из задач являлось
написание собственной реализации связного списка (Linked List).

Работа состоит из 4-частей:

1)Сравнение производительности java.util.LinkedList и собственной
реализации связного списка для основных операций.

2)Сравнение производительности ArrayList и Linkedlist для
основных операций.

3)Сравение производительности HashSet, LinkedHashSet, TreeSet
для основных операций.

4)Сравнение производительности HashMap, LinkedHashMap, TreeMap
для основных операций. 


					Часть 1. java.util.Linkedlist и собственный лист

В процессе работы мной был описан собственный класс LinkedList, реализованы
основные методы. Мой LinkedList оказался сопоставим по производительности со стандартным,
время работы моего связного списка пропорциональна производительности стандартного при выполнении 
всех основных операций, что говорит о том, что структура данных была реализована верно.

![Image alt](https://github.com/black20lion/Images/blob/main/MyLinkListTable.png)

					Таблица 1. Время работы MyLinkedList для основных операций
					
![Image alt](https://github.com/black20lion/Images/blob/main/LinkListTable.png)

				Таблица 2. Время работы java.util.LinkedList для основных операций
				
![Image alt](https://github.com/black20lion/Images/blob/main/FirstGraph.png)
				
		Рисунок 1. Сравнение производительности MyLinkedList и java.util.LinkedList на операции добавления
Как видно из графика выше, время выполнения добавления в конец растет линейно в зависимости от числа добавляемых элементов, иными словами операция добавления одного элемента - константа в обоих случаях.

![Image alt](https://github.com/black20lion/Images/blob/main/Graph2.png)

		Рисунок 2. Сравнение производительности MyLinkedList и java.util.LinkedList на операции вставки в середину
График выше показывает, что время добавления элемента в середину связного списка (поиск по индексу) увеличивается с количеством элементов в списке. В стандартной реализации график напоминает логарифмический, в собственной реализации - линейный. Худшее время поиска по индексу для связного списка действительно - O(n).

![Image alt](https://github.com/black20lion/Images/blob/main/Graph3.png)

		Рисунок 3. Сравнение производительности MyLinkedList и java.util.LinkedList на операции вставки в начало
		
![Image alt](https://github.com/black20lion/Images/blob/main/Graph4.png)

	Рисунок 4. Сравнение производительности MyLinkedList и java.util.LinkedList на операции удаления первого элемента
		
![Image alt](https://github.com/black20lion/Images/blob/main/Graph5.png)

	Рисунок 5. Сравнение производительности MyLinkedList и java.util.LinkedList на операции удаления последнего элемента
Предыдущие три графика отображают совсем незначительные изменения во времени работы с крайними элементами листа в зависимости от количества элементов в нем. Это подтверждает очевидный факт константного времени работы листа с первым и последним элементом коллекции и констаное время добавления элементов в начало и конец списка.

![Image alt](https://github.com/black20lion/Images/blob/main/Graph6.png)

	Рисунок 6. Сравнение производительности MyLinkedList и java.util.LinkedList на операции удаления элемента из середины
График выше показывает, что удаление элемента из середины (по индексу), так же, как и вставка в середину, выполняется в худшем случае за линейное время.

						Часть 2. Linkedlist и ArrayList
Данная часть работы была посвящена сравнению производительности LinkedList и ArrayList.

![Image alt](https://github.com/black20lion/Images/blob/main/Table3.png)


					Таблица 3. Время работы ArrayList для основных операций
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph1.png)

			Рисунок 7. Сравнение производительности LinkedList и ArrayList на операции добавления
	
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph2.png)

			Рисунок 8. Сравнение производительности LinkedList и ArrayList на операции на операции вставки в середину
	
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph3.png)
	
			Рисунок 9. Сравнение производительности LinkedList и ArrayList на операции вставки в начало
	
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph4.png)

			Рисунок 10. Сравнение производительности LinkedList и ArrayList на операции удаления первого элемента
	
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph5.png)

		Рисунок 11. Сравнение производительности LinkedList и ArrayList на операции удаления последнего элемента
	
![Image alt](https://github.com/black20lion/Images/blob/main/ArrayGraph6.png)

		Рисунок 12. Сравнение производительности LinkedList и ArrayList на операции удаления элемента из середины
На основании графиков можно установить, что доступ к крайним элементам быстрее у LinkedList, однако в добавлении и удалении центрального элемента быстрее оказался ArrayList, т.к. данная операция включает в себя поиск по индексу, а перекопирование массива в стандартной реализации работает довольно быстро. Добавление в конец так же быстрее у ArrayList.
