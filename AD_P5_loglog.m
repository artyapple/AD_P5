
N = [1 10 100 1000 10000 100000 1000000];
avgFirst = [1 34 665 8661 139499 1664024 19767515];
avgMedian = [1 28 586 9059 124650 1578404 19109411];
avgRandom = [1 29 708 10685 161972 2166166 25485511];


%1 34 665 8661 139499 1664024 19767515 1 28 586 9059 124650 1578404 19109411 1 29 708 10685 161972 2166166 25485511 
%2 29 804 11993 165195 2200842 25136920 2 37 641 9872 131916 1652351 19848621 2 35 744 14659 165331 2144774 25999129 

bestMedian = [1 25 543 8498 119535 1534481 18475732];

worstFirst = [1 54 5049 500499 50004999 5000049999 500000499999];

%bestCase = [0 33 664 9965 132877 1660964 19931568];
%worstCase = [1 100 10000 1000000 100000000 10000000000 1000000000000 ];

%loglog(N, bestMedian)
%grid on;
%xlabel('N');
%ylabel('T(N)');
%text(10000,119535,'\leftarrow 3-Median Best Case');

%loglog(N, worstFirst)
%grid on;
%xlabel('N');
%ylabel('T(N)');
%text(10000,50004999,'\leftarrow First Element Worst Case');

loglog(N, avgFirst,'color','r'); hold on;
grid on;
loglog(N, avgMedian,'color','b'); hold on;
loglog(N, avgRandom,'color','g'); hold on;
xlabel('N');
ylabel('T(N)');