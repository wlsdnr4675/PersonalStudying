import {
  FETCH_TOTALCOMMUNITY_LIST,
  FETCH_TOTALCOMMUNITY
  } from './mutation-types'
  
  import axios from 'axios'
  
  //비동기처리
  export default {
      //커밋하는게 여러게 있을 수 있으므로 {} 로 묶는다
    fetchTotalCommunityList ({ commit }) {
      return axios.get('http://localhost:8888/totalCommunities')
        .then(res => {
            //컨트롤러 list의 모든 데이터가 res.data에 있음
            // 커밋하면  뮤테이션으로 이동
          commit(FETCH_TOTALCOMMUNITY_LIST, res.data)
        })
    },
    fetchTotalCommunity ({ commit }, boardNo) {
      console.log('fetchTotalCommunity ' + commit + ', boardNo = ' + boardNo)
      return axios.get(`http://localhost:8888/totalCommunities/${boardNo}`)
        .then(res => {
          console.log('fetchTotalCommunity - res: ' + res.data)
          commit(FETCH_TOTALCOMMUNITY, res.data)
        })
    }
  }