
import {
  FETCH_TOTALCOMMUNITY_LIST,
  FETCH_TOTALCOMMUNITY
  } from './mutation-types'
  //여기 데이터 처리시 서로간 방해를 받지 않음
  //멀테 쓰레드 크리티컬섹션 처리해주는 속성을 가지고 있음
  export default {
    [FETCH_TOTALCOMMUNITY_LIST] (state, totalCommunities) {
                      //FETCH_BOARD_LIST, res.data 값
      state.totalCommunities = totalCommunities
    },
    [FETCH_TOTALCOMMUNITY] (state, totalCommunity) {
      state.totalCommunity = totalCommunity
    }
  }