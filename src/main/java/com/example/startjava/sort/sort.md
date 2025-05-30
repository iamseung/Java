## 📊 정렬 알고리즘 비교표

| 정렬 알고리즘 | 평균 시간복잡도 | 최악 시간복잡도 | 공간복잡도 | 안정 정렬 | 주요 특징                               |
|----------------|------------------|------------------|-------------|------------|------------------------------------------|
| 버블 정렬      | O(n²)            | O(n²)            | O(1)        | ✅         | 느림. 학습용으로 적합                    |
| 선택 정렬      | O(n²)            | O(n²)            | O(1)        | ❌         | 교환 횟수 적지만 안정성 없음            |
| 삽입 정렬      | O(n²)            | O(n²)            | O(1)        | ✅         | 거의 정렬된 경우 빠름                   |
| 퀵 정렬        | O(n log n)       | O(n²)            | O(log n)    | ❌         | 실무에서 많이 사용됨. 불안정 정렬       |
| 병합 정렬      | O(n log n)       | O(n log n)       | O(n)        | ✅         | 항상 안정적. 공간 많이 씀               |
| 힙 정렬        | O(n log n)       | O(n log n)       | O(1)        | ❌         | 공간 효율 우수. 약간 느릴 수 있음       |