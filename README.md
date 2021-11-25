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
основные методы. Мой LinkedList оказался медленнее стандартного,
возможно это связано с тем, что необходимые методы были реализованы
более "наивно", без вспомогательных функций. Тем не менее, производительность
моего связного списка пропорциональна производительности стандартного при выполнении 
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
