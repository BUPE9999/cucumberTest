Feature: webTest

  Scenario: search"Java"
    Given open baidu
    When input "Java"
    Then show "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=Java&fenlei=256&rsv_pq=0xb88e25f00000dfd2&rsv_t=f86db4qE%2FqUQx%2FtiaY98f1JHTIzGfSm%2Bu8QaSobymfVNBE43hzxVECbFFgR%2B&rqlang=en&rsv_enter=0&rsv_dl=tb&rsv_sug3=4&rsv_sug1=1&rsv_sug7=100&rsv_btype=i&prefixsug=Java&rsp=0&inputT=4572&rsv_sug4=4572&rsv_jmp=fail"