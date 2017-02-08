/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 3, 2017 6:44:23 PM                      ---
 * ----------------------------------------------------------------
 */
package com.mysite.core.jalo;

import com.mysite.core.constants.MysiteCoreConstants;
import de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.SimpleBannerComponent MysiteRecommendedProductsComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMysiteRecommendedProductsComponent extends SimpleBannerComponent
{
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.Headline</code> attribute **/
	public static final String HEADLINE = "Headline";
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.product1</code> attribute **/
	public static final String PRODUCT1 = "product1";
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.product2</code> attribute **/
	public static final String PRODUCT2 = "product2";
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.product3</code> attribute **/
	public static final String PRODUCT3 = "product3";
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.product4</code> attribute **/
	public static final String PRODUCT4 = "product4";
	/** Qualifier of the <code>MysiteRecommendedProductsComponent.product5</code> attribute **/
	public static final String PRODUCT5 = "product5";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HEADLINE, AttributeMode.INITIAL);
		tmp.put(PRODUCT1, AttributeMode.INITIAL);
		tmp.put(PRODUCT2, AttributeMode.INITIAL);
		tmp.put(PRODUCT3, AttributeMode.INITIAL);
		tmp.put(PRODUCT4, AttributeMode.INITIAL);
		tmp.put(PRODUCT5, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.Headline</code> attribute.
	 * @return the Headline
	 */
	public String getHeadline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.Headline</code> attribute.
	 * @return the Headline
	 */
	public String getHeadline()
	{
		return getHeadline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.Headline</code> attribute. 
	 * @param value the Headline
	 */
	public void setHeadline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.Headline</code> attribute. 
	 * @param value the Headline
	 */
	public void setHeadline(final String value)
	{
		setHeadline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product1</code> attribute.
	 * @return the product1
	 */
	public Product getProduct1(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product1</code> attribute.
	 * @return the product1
	 */
	public Product getProduct1()
	{
		return getProduct1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product1</code> attribute. 
	 * @param value the product1
	 */
	public void setProduct1(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product1</code> attribute. 
	 * @param value the product1
	 */
	public void setProduct1(final Product value)
	{
		setProduct1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product2</code> attribute.
	 * @return the product2
	 */
	public Product getProduct2(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product2</code> attribute.
	 * @return the product2
	 */
	public Product getProduct2()
	{
		return getProduct2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product2</code> attribute. 
	 * @param value the product2
	 */
	public void setProduct2(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product2</code> attribute. 
	 * @param value the product2
	 */
	public void setProduct2(final Product value)
	{
		setProduct2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product3</code> attribute.
	 * @return the product3
	 */
	public Product getProduct3(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product3</code> attribute.
	 * @return the product3
	 */
	public Product getProduct3()
	{
		return getProduct3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product3</code> attribute. 
	 * @param value the product3
	 */
	public void setProduct3(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product3</code> attribute. 
	 * @param value the product3
	 */
	public void setProduct3(final Product value)
	{
		setProduct3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product4</code> attribute.
	 * @return the product4
	 */
	public Product getProduct4(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product4</code> attribute.
	 * @return the product4
	 */
	public Product getProduct4()
	{
		return getProduct4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product4</code> attribute. 
	 * @param value the product4
	 */
	public void setProduct4(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product4</code> attribute. 
	 * @param value the product4
	 */
	public void setProduct4(final Product value)
	{
		setProduct4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product5</code> attribute.
	 * @return the product5
	 */
	public Product getProduct5(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT5);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteRecommendedProductsComponent.product5</code> attribute.
	 * @return the product5
	 */
	public Product getProduct5()
	{
		return getProduct5( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product5</code> attribute. 
	 * @param value the product5
	 */
	public void setProduct5(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT5,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteRecommendedProductsComponent.product5</code> attribute. 
	 * @param value the product5
	 */
	public void setProduct5(final Product value)
	{
		setProduct5( getSession().getSessionContext(), value );
	}
	
}
