package myPack;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class MovieDAO {
	NamedParameterJdbcTemplate namedParaJdbcTemp;

	public NamedParameterJdbcTemplate getNamedParaJdbcTemp() {
		return namedParaJdbcTemp;
	}


	public void setNamedParaJdbcTemp(NamedParameterJdbcTemplate namedParaJdbcTemp) {
		this.namedParaJdbcTemp = namedParaJdbcTemp;
	}

	public int saveMovie(Movies m1)
	{
		String sqlStr = "INSERT INTO mymovies VALUES(:mId,:mTitle,:mActor)";
		SqlParameterSource params = new BeanPropertySqlParameterSource(m1);
		return namedParaJdbcTemp.update(sqlStr, params)
		
	}
	
public Movies displayMovieDetails(Movies m1)
{
	String sqlStr = "SELECT * FROM mymovies WHERE movid = :mId";
	SqlParameterSource params = new BeanPropertySqlParameterSource(m1);
	return namedParaJdbcTemp.queryForObject(sqlStr, params, new BeanPropertyRowMapper<Movies>(){});
	
}
	
		/*Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", om.getOrderId());
		params.put("supplierNm", om.getSupplierNm());
		params.put("orderAmt", om.getOrderAmt());*/
		
		/*MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("orderId", om.getOrderId());
		params.addValue("supplierNm", om.getSupplierNm());
		params.addValue("orderAmt", om.getOrderAmt());*/
	
	
	public OrderMst displayResultSet(OrderMst selOrd) {
		String sqlStr = "SELECT * FROM orderMst WHERE orderId = :orderId";
		SqlParameterSource params = new BeanPropertySqlParameterSource(selOrd);
		//OrderMst ordDtls = template.queryForObject(sqlStr, params, 
							//new BeanPropertyRowMapper<OrderMst>(OrderMst.class));
		//return ordDtls;

		OrderMst ordDtls = template.queryForObject(sqlStr, params, 
					new BeanPropertyRowMapper<OrderMst>() {	
			
			@Override
			public OrderMst mapRow(ResultSet arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			OrderMst ordObj = new OrderMst();
			ordObj.setOrderId(arg0.getInt("orderId"));
			ordObj.setSupplierNm(arg0.getString("supplierNm"));
			ordObj.setOrderAmt(arg0.getDouble("orderAmt"));
			return ordObj;
		}
	});
		
		return ordDtls;
	}
	
	public List<OrderMst> getAllOrders() {
		String sqlStr = "SELECT * FROM orderMst";
		return template.query(sqlStr, new ResultSetExtractor<List<OrderMst>>() {

			@Override
			public List<OrderMst> extractData(ResultSet arg0) 
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				List<OrderMst> ordList = new ArrayList<OrderMst>();
				while(arg0.next()) {
					OrderMst ordObj = new OrderMst();
					ordObj.setOrderId(arg0.getInt(1));
					ordObj.setSupplierNm(arg0.getString(2));
					ordObj.setOrderAmt(arg0.getDouble(3));
					
					ordList.add(ordObj);
				}
				return ordList;
			}	
		});
	}
	
	public void getAllOrdersinList() {
		String sqlStr = "SELECT * FROM orderMst";
		System.out.println(template.queryForList(sqlStr, new HashMap<String, Object>()));
	}	
	
	
	
}