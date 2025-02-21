package kh.edu.react.provider.controller;

import kh.edu.react.provider.dto.Product;
import kh.edu.react.provider.service.ProductService;
import kh.edu.react.provider.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// url api endpoint 차이
/* url api endpoint
URL = 웹에서 특정 리소스(페이지, 이미지, API 등) 에 접근하기 위한 주소
https    ://      www.kht.com     /api/users/123
프로토콜   구분자       도메인            경로(path)

API = 프로그램 간 데이터와 기능을 주고 받을 수 있또록 만든 인터페이스.
API 는 여러개의 Endpoint(접속 지점)을 포함함.
    api 방식에는 대표적으로 REST API (=get, post, put, delete 와 같은 형식으로 데이터 전달,전송,수정,삭제)

EndPoint = API 에서 특정 작업을 수행하는 URL.
예를들어 아래와 같은 URL(API)가 있다고 가정하면,
https    ://      www.kht.com     /api/users/123

GET      /api/users/123 -> 123이라는 사용자 조회
POST     /api/users/123 -> 123이라는 사용자 생성
PUT      /api/users/123 ->  123이라는 사용자 수정
DELETE   /api/users/123 ->  123이라는 사용자 삭제

ex)
음식점으로 치면 식당의 주소 = URL
인터넷상 : https://www.kht.com
음식점 실제 주소 : 서울시 강남구 00동 123번지

API      = 음식점에서 서비스를 제공하는 시스템(메뉴판)

EndPoint = 음식점에서 특정 기능을 수행하는 세부 서비스
POST   /api/orders     -> 갈비 주문 음식 요청
GET    /api/orders/123 -> 갈비 주문 상태 확인(배달 진행 상황 확인)
DELETE /api/orders/123 -> 갈비 주문 취소 (음식 취소)



 */

//api endpoint 명칭 사용
@RestController
@RequestMapping("/api/products")
public class ProductAPIController {

    @Autowired //controller에서 실제 서비스가 들어있는 Impl 필히 확인
    private ProductServiceImpl productService;

    //모든 제품 조회
    @GetMapping  //  /api/products
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    //제품 검색
    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
        return productService.searchProducts(keyword);
    }

    //특정 제품 상세조회
    @GetMapping("/{productId}")
    public Product findProductById(@PathVariable int productId) {
        return productService.findProductById(productId);
    }

    //제품 저장
    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }




}
