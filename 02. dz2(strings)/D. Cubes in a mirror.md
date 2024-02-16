   <div class="header">
      <h1 class="title">D. Кубики в зеркале</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>5&nbsp;секунд</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>256Mb</td>
         </tr>
         <tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="1">стандартный ввод или input.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="1">стандартный вывод или output.txt</td>
         </tr>
      </tbody></table>
   </div>   
   <div class="legend"><span style="">
         <p>Привидение Петя любит играть со своими кубиками. Он любит выкладывать их в ряд и разглядывать свое творение. Недавно друзья
            решили подшутить над Петей и поставили в его игровой комнате зеркало. Известно, что привидения не отражаются в зеркале, а
            кубики отражаются. Теперь Петя видит перед собой N цветных кубиков, но не знает, какие из этих кубиков настоящие, а какие
            — отражение в зеркале. Выясните, сколько кубиков может быть у Пети. Петя видит отражение всех кубиков в зеркале и часть кубиков,
            которая находится перед ним. Часть кубиков может быть позади Пети, их он не видит.
         </p></span><p><img class="user-image" src="D. Cubes in a mirror.png"></p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Первая строка входного файла содержит число N ( 1≤ N ≤1000000 ) и количество различных цветов, в которые могут быть раскрашены
            кубики — M ( 1≤ M ≤1000000 ). Следующая строка содержит N целых чисел от 1 до M — цвета кубиков.
         </p></span><p></p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите в выходной файл все такие K, что у Пети может быть K кубиков</p></span><p></p>
   </div>
   <h2>Пример</h2>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>6 2
1 1 2 2 1 1
</pre></td>
            <td><pre>3 5 6
</pre></td>
         </tr>
      </tbody>
   </table>