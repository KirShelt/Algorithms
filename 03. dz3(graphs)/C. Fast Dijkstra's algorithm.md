   <div class="header">
      <h1 class="title">C. Быстрый алгоритм Дейкстры</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>5&nbsp;секунд</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>512Mb</td>
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
         <p>Вам дано описание дорожной сети страны. Ваша задача – найти длину кратчайшего пути между городами А и B.</p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Сеть дорог задана во входном файле следующим образом: первая строка содержит числа N и K (<span class="tex-math-text">1 ≤ N ≤ 100000</span>, <span class="tex-math-text">0 ≤ K ≤ 300000</span>), где K – количество дорог. Каждая из следующих K строк содержит описание дороги с двусторонним движением – три целых числа
            <span class="tex-math-text">a<sub>i</sub></span>, <span class="tex-math-text">b<sub>i</sub></span> и <span class="tex-math-text">l<sub>i</sub></span> (<span class="tex-math-text">1 ≤ a<sub>i</sub>, b<sub>i</sub> ≤ N</span>, <span class="tex-math-text">1 ≤ l<sub>i</sub> ≤ 10<sup>6</sup></span>). Это означает, что имеется дорога длины <span class="tex-math-text">l<sub>i</sub></span>, которая ведет из города <span class="tex-math-text">a<sub>i</sub></span> в город <span class="tex-math-text">b<sub>i</sub></span>. В последней строке находятся два числа А и В – номера городов, между которыми надо посчитать кратчайшее расстояние (<span class="tex-math-text">1 ≤ A, B ≤ N</span>)
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите одно число – расстояние между нужными городами. Если по дорогам от города А до города В доехать невозможно, выведите
            –1.
         </p></span></div>
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
            <td><pre>6 4
1 2 7
2 4 8
4 5 1
4 3 100
3 1
</pre></td>
            <td><pre>115
</pre></td>
         </tr>
      </tbody>
   </table>